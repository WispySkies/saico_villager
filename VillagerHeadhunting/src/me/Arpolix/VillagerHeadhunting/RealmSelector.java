/*
 * 
 * Code is likely very sloppy. It was done fast but it works.
 * 
 */

package me.Arpolix.VillagerHeadhunting;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class RealmSelector implements Listener {

	public void openInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, "§5Servers");
	    
		ItemStack skeleton = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta skele = (SkullMeta) skeleton.getItemMeta();
		skele.setOwner(p.getName());
		skele.setDisplayName("§r§lSkeleton Realm");
		skeleton.setItemMeta(skele);
		inv.setItem(0, new ItemStack(skeleton));
		
	    ItemStack zombie = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta zom = (SkullMeta) zombie.getItemMeta();
		zom.setOwner(p.getName());
		zom.setDisplayName("§a§lZombie Realm");
		zombie.setItemMeta(zom);
		inv.setItem(1, new ItemStack(zombie));
		
		ItemStack wither = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta w = (SkullMeta) wither.getItemMeta();
		w.setOwner(p.getName());
		w.setDisplayName("§7§lWither Realm");
		wither.setItemMeta(w);
		inv.setItem(2, new ItemStack(wither));
		
		ItemStack cannon = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta c = (SkullMeta) cannon.getItemMeta();
		c.setOwner(p.getName());
		c.setDisplayName("§4§lCannon Training");
		cannon.setItemMeta(c);
		inv.setItem(3, new ItemStack(cannon));
		
		ItemStack hub = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta h = (SkullMeta) hub.getItemMeta();
		h.setOwner(p.getName());
		h.setDisplayName("§b§lHub");
		hub.setItemMeta(h);
		inv.setItem(4, new ItemStack(hub));
		
		ItemStack witch = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta wi = (SkullMeta) witch.getItemMeta();
		wi.setOwner(p.getName());
		wi.setDisplayName("§5§lWitch Realm");
		witch.setItemMeta(wi);
		inv.setItem(5, new ItemStack(witch));
		
		ItemStack villager = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta v = (SkullMeta) witch.getItemMeta();
		v.setOwner(p.getName());
		v.setDisplayName("§e§lVillager Realm");
		villager.setItemMeta(v);
		inv.setItem(6, new ItemStack(villager));
		
		ItemStack magma = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta m = (SkullMeta) magma.getItemMeta();
		m.setOwner(p.getName());
		m.setDisplayName("§4§lMagma Realm");
		magma.setItemMeta(m);
		inv.setItem(7, new ItemStack(magma));
		
		ItemStack blaze = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta bl = (SkullMeta) blaze.getItemMeta();
		bl.setOwner(p.getName());
		bl.setDisplayName("§6§lBlaze Realm");
		blaze.setItemMeta(bl);
		inv.setItem(8, new ItemStack(blaze));
		
	    p.openInventory(inv);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		ItemStack i = e.getCurrentItem();
		
		if (i.getItemMeta().getDisplayName().contains("Hub")) {
			e.setCancelled(true);
		}

		if (i.getItemMeta().getDisplayName().contains(p.getName())) {
			e.setCancelled(true);
		}
		
		if (i.getItemMeta().getDisplayName().contains("Skeleton")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Zombie")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Wither")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Hub")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Magma")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Witch")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Cannon")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Blaze")) {
			e.setCancelled(true);
		}
		if (i.getItemMeta().getDisplayName().contains("Villager")) {
			WorldCreator creator = new WorldCreator("villager");
			creator.environment(World.Environment.NORMAL);
			creator.type(WorldType.FLAT);
			creator.generateStructures(true);
			World world = creator.createWorld();
			p.teleport(world.getSpawnLocation());
			e.setCancelled(true);
		}
	}
}
