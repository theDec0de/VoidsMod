package com.DEC0DE.VoidsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ApollyonicBlock extends BlockBase {
	public ApollyonicBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 3);
	}
}
