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
		Player p = event.getPlayer();
		ItemStack hand = p.getItemInHand();
		
		if (block.getType() == Material.STONE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.COBBLESTONE, 1, 0);
		}
		
		else if (block.getType() == Material.LONG_GRASS && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (methods.random(1, 100) <= 40) {
				methods.checkBlock(p, block, Material.SEEDS, methods.random(1, 3), 0);
			}
		}
		else if (block.getType() == Material.BOOKSHELF && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.BOOK, 3, 0);
		}
		else if (block.getType() == Material.CLAY && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.CLAY_BALL, 4, 0);
		}
		else if (block.getType() == Material.DOUBLE_STEP) {
			methods.checkBlock(p, block, Material.STEP, 2, 0);
		}
		else if (block.getType() == Material.GLASS && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.AIR, 0, 0);
		}
		else if (block.getType() == Material.THIN_GLASS && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.AIR, 0, 0);
		}
		else if (block.getType() == Material.GLOWSTONE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.GLOWSTONE, methods.random(4, 6), methods.random(2, 4));
			}
			else {
				methods.checkBlock(p, block, Material.GLOWSTONE, methods.random(2, 4), methods.random(1, 3));
			}
		}
		else if (block.getType() == Material.GRASS || block.getType() == Material.SOIL || block.getType() == Material.MYCEL && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.DIRT, 1, 0);
		}
		else if (block.getType() == Material.GRAVEL && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.FLINT, 1, 0);
			}
			else {
				if (methods.random(1, 100) <= 30) {
					methods.checkBlock(p, block, Material.FLINT, 1, 0);
				}
				else {
					methods.checkBlock(p, block, Material.GRAVEL, 1, 0);
				}
			}
		}
		else if (block.getType() == Material.ICE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.ICE, 0, 0);
		}
		else if (block.getType() == Material.SNOW_BLOCK && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.SNOW_BALL, 4, 0);
		}
		else if (block.getType() == Material.SNOW) {
			methods.checkBlock(p, block, Material.SNOW_BALL, 1, 0);
		}
		else if (block.getType() == Material.COAL_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.COAL, methods.random(2, 4), methods.random(2, 4));
			}
			else {
				methods.checkBlock(p, block, Material.COAL, 1, methods.random(1, 3));
			}
		}
		else if (block.getType() == Material.DIAMOND_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.DIAMOND, methods.random(2, 4), methods.random(6, 9));
			}
			else {
				methods.checkBlock(p, block, Material.DIAMOND, 1, methods.random(4, 7));
			}
		}
		else if (block.getType() == Material.EMERALD_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.EMERALD, methods.random(2, 4), methods.random(6, 9));
			}
			else {
				methods.checkBlock(p, block, Material.EMERALD, 1, methods.random(4, 7));
			}
		}
		/*else if (block.getType() == Material.LAPIS_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				ItemStack lapis = new ItemStack(351, methods.random(8, 12), (byte)4);
				pInv.addItem(lapis);
				expMan.changeExp(methods.random(4,7));
			}
			else {
				ItemStack lapis = new ItemStack(351, methods.random(8, 12), (byte)4);
				pInv.addItem(lapis);
				expMan.changeExp(methods.random(3,6));	
			}
		}*/
		else if (block.getType() == Material.QUARTZ_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.QUARTZ, methods.random(2, 4), methods.random(3, 6));
			} 
			else {
				methods.checkBlock(p, block, Material.QUARTZ, 1, methods.random(3, 6));
			}
		}
		else if (block.getType() == Material.REDSTONE_ORE || block.getType() == Material.GLOWING_REDSTONE_ORE && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			if (p.getItemInHand().getEnchantments() == Enchantment.LOOT_BONUS_BLOCKS) {
				methods.checkBlock(p, block, Material.REDSTONE, methods.random(6, 8), methods.random(4, 7));
			}
			else {
				methods.checkBlock(p, block, Material.REDSTONE, methods.random(4, 6), methods.random(2, 6));
			}
		}
		else if (block.getType() == Material.DEAD_BUSH) {
			methods.checkBlock(p, block, Material.BOOK, 0, 0);
		}
		else if (block.getType() == Material.HUGE_MUSHROOM_1 && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.BROWN_MUSHROOM, methods.random(1, 2), 0);
		}
		else if (block.getType() == Material.HUGE_MUSHROOM_2 && p.getItemInHand().getEnchantments() != Enchantment.SILK_TOUCH) {
			methods.checkBlock(p, block, Material.RED_MUSHROOM, methods.random(1, 2), 0);
		}
		
		else {
			methods.checkBlock(p, block, block.getType(), 1, 0);
		}
		event.setCancelled(true);
		block.setType(Material.AIR);
	}
}