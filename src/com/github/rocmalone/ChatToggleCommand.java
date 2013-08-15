package com.github.rocmalone;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatToggleCommand implements CommandExecutor {
	
	public boolean isChat = true;
	
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
		Player p = (Player) sender;
		
		if (p.isOp()) {
			if (isChat == true) {
				isChat = false;
				p.sendMessage("§e[BetterMinecraft]§f Chat has been disabled");
			}
			else if (isChat == false) {
				isChat = true;
				p.sendMessage("§e[BetterMinecraft]§f Chat has been enabled");
			}
			return true;
		}
		else {
			return false;
		}	
	}
}
