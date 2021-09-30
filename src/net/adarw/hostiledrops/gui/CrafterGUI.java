package net.adarw.hostiledrops.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import com.booksaw.guiAPI.API.Gui;
import com.booksaw.guiAPI.API.items.GuiItem;
import com.booksaw.guiAPI.API.items.ItemCollection;
import com.booksaw.guiAPI.API.items.itemActions.CancelEvent;

public class CrafterGUI extends Gui {

	 
	   @Override
	   protected String getName() {
	       return ChatColor.RED + "Crafter";
	   }

	   @Override
	   protected String getReference() {
	       return "net.adarw.hostiledrops.CrafterGUI";
	   }

	   @Override
	   protected void initialise(ItemCollection items) {
		   GuiItem item = new GuiItem(new ItemStack(Material.BLACK_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem item2 = new GuiItem(new ItemStack(Material.PINK_STAINED_GLASS_PANE),  new CrafterAction());
		   GuiItem itemY = new GuiItem(new ItemStack(Material.YELLOW_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemB = new GuiItem(new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemG = new GuiItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemL = new GuiItem(new ItemStack(Material.LIME_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemM = new GuiItem(new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemO = new GuiItem(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemW = new GuiItem(new ItemStack(Material.WHITE_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemBRO = new GuiItem(new ItemStack(Material.BROWN_STAINED_GLASS_PANE),  new CancelEvent());
		   GuiItem itemBR = new GuiItem(new ItemStack(Material.BARRIER),  new CancelEvent());
		   GuiItem itemClose = new GuiItem(new ItemStack(Material.BARRIER),  new CloseAction());
		   
		    items.addItem(item,3, 0);
	       	items.addItem(item2,3, 1);
	       	items.addItem(item,3, 2);
	       	items.addItem(item,4, 0);
	       	items.addItem(item,4, 1);
	       	items.addItem(item,4, 2);
	       	items.addItem(itemY,5, 0);
	       	items.addItem(itemB,5, 1);
	       	items.addItem(itemG,5, 2);
	       	items.addItem(itemBRO,6, 0);
	       	items.addItem(itemBR,6, 1);
	       	items.addItem(itemL,6, 2);
	       	items.addItem(itemW,7,0);
	       	items.addItem(itemO,7, 1);
	       	items.addItem(itemM,7, 2);
	       	items.addItem(itemClose,8, 0);
	       	items.addItem(item,8, 1);
	       	items.addItem(item,8, 2);
	   }

	   

		@Override
		protected void buildGui(Player p, ItemCollection items, String[] details) {
			
			if(details != null) {
				try  {
					items.addItem(new GuiItem(new ItemStack(Material.valueOf(details[0]))), 6, 1);
				}catch(Exception ex) {
					
				}
			}
		}
		
		


		@Override
		public void clickedMainInventory(Player p , ItemStack is, InventoryClickEvent event) {
			
		}
		
		@Override
		public void onClose(Player p, InventoryCloseEvent e) {
			this.displayGui(p);
		}
		
	}