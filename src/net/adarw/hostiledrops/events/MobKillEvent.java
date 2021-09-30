package net.adarw.hostiledrops.events;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.adarw.hostiledrops.configuration.Config;

public class MobKillEvent implements Listener{

	@EventHandler
	public void onEDeath(EntityDeathEvent event) {
		LivingEntity e = event.getEntity();
		if(e.getType() == EntityType.ENDERMAN) {
			//This executes on enderman kill
			ItemStack stack = new ItemStack(Config.USELESS_ITEM);
			ItemMeta meta = stack.getItemMeta();
			meta.setCustomModelData(Config.ENDERMAN_MODELDATA);
			meta.setDisplayName(Config.ENDERMAN_NAME);
			stack.setItemMeta(meta);
			Location l  = e.getLocation();
			l.getWorld().dropItemNaturally(l, stack);
			
		}else if(e.getType() == EntityType.ZOMBIE) {
			//This executes on zombie kill
			ItemStack stack = new ItemStack(Config.USELESS_ITEM);
			ItemMeta meta = stack.getItemMeta();
			meta.setCustomModelData(Config.ZOMBIE_MODELDATA);
			meta.setDisplayName(Config.ZOMBIE_NAME);
			stack.setItemMeta(meta);
			Location l  = e.getLocation();
			l.getWorld().dropItemNaturally(l, stack);
			
		}else if(e.getType() == EntityType.SKELETON) {
			//This executes on skeleton kill
			ItemStack stack = new ItemStack(Config.USELESS_ITEM);
			ItemMeta meta = stack.getItemMeta();
			meta.setCustomModelData(Config.SKELETON_MODELDATA);
			meta.setDisplayName(Config.SKELETON_NAME);
			stack.setItemMeta(meta);
			Location l  = e.getLocation();
			l.getWorld().dropItemNaturally(l, stack);
			
		}else if(e.getType() == EntityType.SPIDER) {
			//This executes on spider kill
			Location l  = e.getLocation();
			l.getWorld().dropItemNaturally(l, new ItemStack(Config.SPIDER_MAT));
			
		}else if(e.getType() == EntityType.SPIDER) {
			//This executes on spider kill
			Location l  = e.getLocation();
			l.getWorld().dropItemNaturally(l, new ItemStack(Config.CREEPER_MAT));
			
		}
	}
	
}
