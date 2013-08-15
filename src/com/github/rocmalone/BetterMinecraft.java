package com.github.rocmalone;

import org.bukkit.plugin.java.JavaPlugin;

public class BetterMinecraft extends JavaPlugin {
	
	private final BlockListener blockListener = new BlockListener();
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(blockListener, this);
		getCommand("bm togglechat").setExecutor(new ChatToggleCommand());
	}
	
	@Override
	public void onDisable() {
		
		
	}
}
