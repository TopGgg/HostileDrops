package net.adarw.hostiledrops.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.booksaw.guiAPI.API.items.itemActions.GuiEvent;
import com.booksaw.guiAPI.API.items.itemActions.ItemAction;

public class CloseAction implements ItemAction {

	@Override
	public void onEvent(GuiEvent e) {
		e.e.setCancelled(true);
		Inventory inv = e.e.getInventory();
		ItemStack s0 = inv.getItem(0);
		ItemStack s1 = inv.getItem(1);
		ItemStack s2 = inv.getItem(2);
		ItemStack s3 = inv.getItem(9);
		ItemStack s4 = inv.getItem(10);
		ItemStack s5 = inv.getItem(11);
		ItemStack s6 = inv.getItem(18);
		ItemStack s7 = inv.getItem(19);
		ItemStack s8 = inv.getItem(20);
		Player p = (Player) e.getPlayer();
		p.closeInventory();
		if(s0 != null)
		p.getInventory().addItem(s0);
		if(s1 != null)
			p.getInventory().addItem(s1);
		if(s2 != null)
			p.getInventory().addItem(s2);
		if(s3 != null)
			p.getInventory().addItem(s3);
		if(s4 != null)
			p.getInventory().addItem(s4);
		if(s5 != null)
			p.getInventory().addItem(s5);
		if(s6 != null)
			p.getInventory().addItem(s6);
		if(s7 != null)
			p.getInventory().addItem(s7);
		if(s8 != null)
			p.getInventory().addItem(s8);

	}

}
