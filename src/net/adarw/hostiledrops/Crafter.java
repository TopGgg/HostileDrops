package net.adarw.hostiledrops;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.booksaw.guiAPI.API.Gui;
import com.booksaw.guiAPI.API.GuiManager;

import net.adarw.hostiledrops.configuration.Config;

public class Crafter {

	public static void openCrafterGUI(Player p) {
		Gui gui = GuiManager.getGui("net.adarw.hostiledrops.CrafterGUI");
		gui.displayGui(p);
	}
	
	public static ItemStack getCrafterStack() {
		ItemStack stack = new ItemStack(Config.USELESS_ITEM);
		ItemMeta meta = stack.getItemMeta();
		meta.setDisplayName(Config.CRAFTER_NAME);
		meta.setCustomModelData(Config.CRAFTER_MODELDATA);
		stack.setItemMeta(meta);
		return stack;
	}
	
}
