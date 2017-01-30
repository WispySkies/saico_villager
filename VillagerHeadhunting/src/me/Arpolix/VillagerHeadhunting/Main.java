package me.Arpolix.VillagerHeadhunting;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new RealmSelector(), this);
		pm.registerEvents(new ItemOnJoin(), this);
		getCommand("instance").setExecutor(new LoadVillagerWorld());
	}
}
