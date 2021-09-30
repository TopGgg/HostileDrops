package net.adarw.hostiledrops.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.adarw.hostiledrops.Crafter;

public class InteractEvent implements Listener{
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Action a = e.getAction();
		if(a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
			if(e.getItem() != null) {
				if(e.getItem().isSimilar(Crafter.getCrafterStack())) {
					Crafter.openCrafterGUI(e.getPlayer());
				}
			}
		}
	}

}
