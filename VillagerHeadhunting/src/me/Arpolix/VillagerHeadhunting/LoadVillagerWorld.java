/*
 * 
 * Creating the use of the world using this is unnecessary.
 * I would recommend using a different way to create the world. 
 * 
 */

package me.Arpolix.VillagerHeadhunting;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoadVillagerWorld implements CommandExecutor {

	World world;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return false;
		}
		if (!cmd.getName().equalsIgnoreCase("instance")) {
			return false;
		}
		if (args[0].equalsIgnoreCase("servers")) {
			RealmSelector rs = new RealmSelector();
			rs.openInv((Player) sender);
			return true;
		} else {
			return false;
		}
	}
}
