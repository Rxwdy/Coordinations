package me.tinuy.coords;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		
		if (arg0 instanceof Player) {
			Player player = (Player) arg0;
			String message = Main.getPlugin().getConfig().getString("message");
			
			message = message.replaceAll("&", "§");
			
			message = message.replaceAll("<x>", Main.getPlugin().getConfig().getString("X")).replaceAll("<y>", Main.getPlugin().getConfig().getString("Y")).replaceAll("<z>", Main.getPlugin().getConfig().getString("Z")).replaceAll("<X>", Main.getPlugin().getConfig().getString("X")).replaceAll("<Y>", Main.getPlugin().getConfig().getString("Y")).replaceAll("<Z>", Main.getPlugin().getConfig().getString("Z"));
			player.sendMessage(message);
		}
		
		return true;
	}

}
