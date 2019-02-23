package com.DEC0DE.VoidsMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.APOLYONIC_ALLOY, 
				new ItemStack(ModItems.APOLYONIC_INGOT, 1), 1);
	}
}
