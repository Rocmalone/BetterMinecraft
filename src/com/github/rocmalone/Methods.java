package com.github.rocmalone;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Methods {
	
	ChatToggleCommand ctc = new ChatToggleCommand();
	
	public int random(int min, int max) {
		int randNum = min + (int)(Math.random() * ((max - min) + 1));
		return randNum;
	}
	
	
	public void checkBlock(Player p, Block block, Material drop, int amnt, int exp) {
		Inventory pInv = p.getInventory();
		ItemStack item = new ItemStack(drop, amnt);
		ExperienceManager expMan = new ExperienceManager(p);
		if (p.getGameMode() != GameMode.CREATIVE) {
			pInv.addItem(item);
			expMan.changeExp(exp);
			/*if (ctc.isChat == true ) {
				p.sendMessage("§2You Recieved: §f" + Integer.toString(amnt) + " " + drop.toString());
			}*/
		}
		if (ctc.isChat == true ) {
			p.sendMessage("§2You Recieved: §f" + Integer.toString(amnt) + " " + drop.toString());
		}
		
	}
}
