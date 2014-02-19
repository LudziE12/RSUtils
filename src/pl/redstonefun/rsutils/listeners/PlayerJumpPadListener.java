package pl.redstonefun.rsutils.listeners;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import pl.redstonefun.rsutils.user.User;

public class PlayerJumpPadListener implements Listener {

	@EventHandler
	public void onPlayerInterract(PlayerInteractEvent e){
		if(e.getAction() == Action.PHYSICAL){
			if(e.getClickedBlock().getType() == Material.GOLD_PLATE){			
				if(e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.MONSTER_EGGS){
					new User(e.getPlayer()).jump(0.50D, 2);
					e.setCancelled(true);
				}
			}
		}
	}
}
