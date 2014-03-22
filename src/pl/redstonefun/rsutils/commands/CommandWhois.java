package pl.redstonefun.rsutils.commands;

import java.net.InetSocketAddress;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.redstonefun.rsutils.api.Arguments;
import pl.redstonefun.rsutils.api.Command;
import pl.redstonefun.rsutils.api.RSCommand;
import pl.redstonefun.rsutils.api.Sender;
import pl.redstonefun.rsutils.main.RSUtils;

@RSCommand(command="whois",description="Inwigilacja ^^", aliases={"ws"})
public class CommandWhois implements Command {

	@Override
	public int[] getMinMax() {
		return new int[]{1,1};
	}

	@Override
	public Sender getSenders() {
		return Sender.ALL;
	}
	
	@Override
	public void exec(CommandSender sender, String command, Arguments args) {
		
		if(sender instanceof Player){
			if(!RSUtils.getUser((Player)sender).hasPermission("rsutils.whois")){
				return;
			}
		}
		
		OfflinePlayer player = Bukkit.getOfflinePlayer(args.get(0));
		if(player.hasPlayedBefore()){
			if(player.isOnline()){
				Player player1 = player.getPlayer();
				InetSocketAddress addr = player1.getAddress();
				sender.sendMessage(ChatColor.GREEN + player.getName() + ", Dostępny:");
				sender.sendMessage(ChatColor.GREEN + "Ip: " + addr.getAddress().getHostAddress());
				sender.sendMessage(ChatColor.GREEN + "Host: " + addr.getAddress().getCanonicalHostName());
				Location loc = player1.getLocation();
				sender.sendMessage(ChatColor.GREEN + "Lokacja: " +loc.getWorld().getName()  + ", x=" + loc.getX() + ", y=" + loc.getY() + ", z=" + loc.getZ());
			} else {
				long last = new Date().getTime() - player.getLastPlayed();
				last /= 1000;
				long sec = (last) % 60;
				long min = (last / 60) % 60;
				long hour = (last / (60*60)) % 24;
				long day = (last / (60*60*24));
				sender.sendMessage(ChatColor.GREEN + player.getName() + ", " + ChatColor.RED + "Niedostępny od: " + day + " dni, "+ hour + " godzin, "+ min + " minut, "+ sec + " sekund");
			}
			sender.sendMessage(ChatColor.GREEN + "PWarp: NIE");
			sender.sendMessage(ChatColor.GREEN + "Home'ów: 12");
			sender.sendMessage(ChatColor.GREEN + "Schematy: 666");
		} else {
			sender.sendMessage(ChatColor.GREEN + player.getName() + ", " + ChatColor.GRAY + "Nigdy nie grał");
		}
	}

}

