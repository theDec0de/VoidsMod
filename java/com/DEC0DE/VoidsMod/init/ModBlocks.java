package com.DEC0DE.VoidsMod.init;

import java.util.ArrayList;
import java.util.List;

import com.DEC0DE.VoidsMod.blocks.ApollyonicBlock;
import com.DEC0DE.VoidsMod.blocks.BlockBase;
import com.DEC0DE.VoidsMod.blocks.RubyBlock;
import com.DEC0DE.VoidsMod.blocks.SapphireBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	/*
	 *	How to make new Blocks:
	 *	make: public static final Block BLOCK_NAME = new BlockBase("Block_Name", Material.BlockMaterial);
	 *	
	 *	jsons:
	 *	--blockstate json
	 *	{
		    "variants": {
		        "normal": { "model": "vm:texture_name" }
		    }
		}
	 *	--block json
	 *	{
		   "parent": "block/cube_all",
		   "textures": {
		       "all": "vm:blocks/texture_name"
		   }
		}
	 *	--item json
	 *	{
		   "parent": "tm:block/ruby_block"
		}
	 *	put texture of block in textures/blocks as "exact_json_names.json"
	 *
	 *	facing="north","south",etc. in your json object under variant for specific texturing
	 */
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("Sapphire_Block", Material.IRON);
	public static final Block RUBY_BLOCK = new RubyBlock("Ruby_Block", Material.IRON);
	public static final Block APOLLYONIC_BLOCK = new ApollyonicBlock("apollyonic_block", Material.IRON);
}
