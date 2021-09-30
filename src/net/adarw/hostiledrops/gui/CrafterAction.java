package net.adarw.hostiledrops.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.booksaw.guiAPI.API.items.itemActions.GuiEvent;
import com.booksaw.guiAPI.API.items.itemActions.ItemAction;

import net.adarw.hostiledrops.configuration.Config;

public class CrafterAction implements ItemAction {

	@Override
	public void onEvent(GuiEvent e) {
		e.e.setCancelled(true);
		Inventory inv = e.e.getClickedInventory();
		ItemStack s0 = inv.getItem(0);
		ItemStack s1 = inv.getItem(1);
		ItemStack s2 = inv.getItem(2);
		ItemStack s3 = inv.getItem(9);
		ItemStack s4 = inv.getItem(10);
		ItemStack s5 = inv.getItem(11);
		ItemStack s6 = inv.getItem(18);
		ItemStack s7 = inv.getItem(19);
		ItemStack s8 = inv.getItem(20);
		if(s0 == null && s1 != null && s2 == null && s3 != null && s4 == null && s5 != null && s6 == null && s7 != null && s8 == null) {
			if(s1.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s3.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s5.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s7.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA ){
				Player p = (Player) e.getPlayer();
				p.closeInventory();
				String[] d = {"NETHERITE_INGOT"};
				e.getGui().displayGui(p,d);
			}
		}
		if(s0 != null && s1 != null && s2 != null && s3 != null && s4 == null && s5 != null && s6 != null && s7 != null && s8 != null) {
			if(s0.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s1.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s2.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s3.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s5.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s6.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s7.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA && s8.getItemMeta().getCustomModelData() == Config.ENDERMAN_MODELDATA) {
				Player p = (Player) e.getPlayer();
				p.closeInventory();
				String[] d = {"NETHERITE_INGOT"};
				e.getGui().displayGui(p,d);
			}
		}
		

	}

}
