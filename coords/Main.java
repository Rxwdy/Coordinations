package me.tinuy.coords;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Plugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		
		saveDefaultConfig();
		getPlugin().getConfig().options().copyDefaults();
		
		this.getCommand("sand").setExecutor(new CommandSand());
		
	}
	
	public static Plugin getPlugin() {
		return plugin;
	}
	
}
