package me.Arpolix.VillagerHeadhunting;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemOnJoin implements Listener {

	@EventHandler
	public void bunnies(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.getInventory().clear();
		
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta meta = (SkullMeta) skull.getItemMeta();
		meta.setOwner(p.getName());
		meta.setDisplayName("§8[§cAdmin§8]§r " + p.getName());
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("§7Right-click this magical skull to find out");
		sl.add("§7more about your progress and stats");
		sl.add("§7for the realm you chose to battle against");
		sl.add("§7the §cEvil Overlord§7 on!");
		meta.setLore(sl);
		skull.setItemMeta(meta);
	    p.getInventory().setItem(0, skull);
		
	    ItemStack realm = new ItemStack(Material.EYE_OF_ENDER, 1);
	    ItemMeta rm = realm.getItemMeta();
	    rm.setDisplayName("§dRealm Transporter §7(Right Click)");
	    ArrayList<String> lore = new ArrayList<String>();
	    lore.add("§7A mysterious artifact that allows for");
	    lore.add("§7transportation to different realms so");
	    lore.add("§7you may continue onwards with the war");
	    lore.add("§7against the §cEvil Overlord§7...");
	    rm.setLore(lore);
	    realm.setItemMeta(rm);
	    p.getInventory().setItem(4, realm);
	    
	    ItemStack hub = new ItemStack(Material.WATCH, 1);
	    ItemMeta hm = realm.getItemMeta();
	    hm.setDisplayName("§dHub Transporter §7(Right Click)");
	    ArrayList<String> hl = new ArrayList<String>();
	    hl.add("§7Travel to a different realm owned");
	    hl.add("§7by the §aWarlock Guild §7where you may");
	    hl.add("§7prepare for the war that awaits...");
	    hm.setLore(hl);
	    hub.setItemMeta(hm);
	    p.getInventory().setItem(5, hub);
	    return;
	}
}
