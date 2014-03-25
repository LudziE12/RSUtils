package pl.redstonefun.rsutils.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.redstonefun.rsutils.api.Arguments;
import pl.redstonefun.rsutils.api.Command;
import pl.redstonefun.rsutils.api.RSCommand;
import pl.redstonefun.rsutils.api.Sender;
import pl.redstonefun.rsutils.main.RSUtils;
import pl.redstonefun.rsutils.message.Messages;
import pl.redstonefun.rsutils.user.User;

@RSCommand(command="tpall", description="Teleportuje graczy do gracza/ciebie")
public class CommandTpAll implements Command {

	@Override
	public int[] getMinMax() {
		return new int[]{0,1};
	}

	@Override
	public Sender getSenders() {
		return Sender.ALL;
	}

	@Override
	public void exec(CommandSender sender, String command, Arguments args) {
		
		if(!(sender instanceof Player) && args.length == 0){
			sender.sendMessage(Messages.notEnoughArguments);
			return;
		}
		
		if(args.length == 0){
			User user = RSUtils.getUser((Player)sender);
			if(user.hasPermission("rsutils.tp.tpall")){
				for(User us : RSUtils.getUsers()){
					if(!us.isVanished()){
						us.teleport(user);
					}
				}
			}
		} else {
			if(sender instanceof Player){
				if(!RSUtils.getUser((Player)sender).hasPermission("rsutils.tp.tpall.someone")){
					return;
				}
			}
			
			User target = RSUtils.getUser(args.get(0));
			
			if(target != null){
				for(User us : RSUtils.getUsers()){
					if(!us.isVanished()){
						us.teleport(target);
					}
				}
			} else {
				sender.sendMessage(Messages.userOffline);
			}
		}
		
	}

}
