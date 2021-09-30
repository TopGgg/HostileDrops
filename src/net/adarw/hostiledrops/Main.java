package net.adarw.hostiledrops;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import com.booksaw.guiAPI.API.GuiManager;

import net.adarw.hostiledrops.events.InteractEvent;
import net.adarw.hostiledrops.events.MobKillEvent;
import net.adarw.hostiledrops.gui.CrafterGUI;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new MobKillEvent(), this);
		this.getServer().getPluginManager().registerEvents(new InteractEvent(), this);
		GuiManager.registerGui(new CrafterGUI());
		
		
       
      NamespacedKey key = new NamespacedKey(this, "custom_crafter_recipe");


      ShapedRecipe recipe = new ShapedRecipe(key, Crafter.getCrafterStack());

        recipe.shape(
        		"  I",
        		" S ",
        		"S  ");

       
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('S', Material.STICK);

        
        Bukkit.addRecipe(recipe);
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
