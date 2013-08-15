package com.github.rocmalone;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BlockListener implements Listener {
	
	Methods methods = new Methods();
	ChatToggleCommand ctc = new ChatToggleCommand();
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		Material[] dontDrop = new Material[]{Material.STONE, Material.LONG_GRASS};
		Player p = event.getPlayer();
		Inventory pInv = p.getInventory();
		int amnt = 1;
		
		if (block.getType() == Material.STONE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			ItemStack item = new ItemStack(Material.COBBLESTONE, amnt);
			pInv.addItem(item);
			if (ctc.isChat == true) {
				p.sendMessage("§2You Recieved: §f" + Integer.toString(amnt) + " " + block.getType().toString());
			}
			
		}
		else if (block.getType() == Material.LONG_GRASS && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (methods.random(1, 100) > 70) {
				amnt = methods.random(1, 2);
				ItemStack item = new ItemStack(Material.SEEDS, amnt);
				pInv.addItem(item);
				if (ctc.isChat == true) {
					p.sendMessage("§2You Recieved: §f" + Integer.toString(amnt) + "SEEDS");
				}
			}
			else {
				
			}
			
		}
		else {
			ItemStack item = new ItemStack(block.getType(), amnt);
			pInv.addItem(item);
			if (ctc.isChat == true) {
				p.sendMessage("§2You Recieved: §f" + Integer.toString(amnt) + " " + block.getType().toString());
			}
		}
		event.setCancelled(true);
		block.setType(Material.AIR);
	}
}