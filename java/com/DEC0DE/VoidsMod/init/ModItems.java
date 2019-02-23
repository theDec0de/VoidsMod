package com.DEC0DE.VoidsMod.init;

import java.util.ArrayList;
import java.util.List;

import com.DEC0DE.VoidsMod.items.ApollyonAxe;
import com.DEC0DE.VoidsMod.items.ApollyonHoe;
import com.DEC0DE.VoidsMod.items.ApollyonPickaxe;
import com.DEC0DE.VoidsMod.items.ApollyonSpade;
import com.DEC0DE.VoidsMod.items.ApollyonSword;
import com.DEC0DE.VoidsMod.items.ItemBase;
import com.DEC0DE.VoidsMod.tools.ToolAxe;
import com.DEC0DE.VoidsMod.tools.ToolHoe;
import com.DEC0DE.VoidsMod.tools.ToolPickaxe;
import com.DEC0DE.VoidsMod.tools.ToolSpade;
import com.DEC0DE.VoidsMod.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	/*
	 *  How to make new items:
	 *  copy this template {
	 *  	public static final Item ITEM_NAME = new ItemBase("Item Name");
	 *  }
	 *  copy json of sapphire and set appropriate spritework
	 */
	
	//TODO: implement all apollyonic tools
	//TODO: make recipes for toolsets
	
	public static final CreativeTabs VOIDSMOD = (new CreativeTabs("voidsmod") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RUBY);
		}
		
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("item_search.png"));
	
	//tool matts
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 
			3, 1951, 10f, 5f, 25);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 
			3, 1951, 10f, 5f, 25);
	public static final ToolMaterial MATERIAL_APOLLYON = EnumHelper.addToolMaterial("material_apollyon", 
			3, 3414, 18f, 12f, 33);
	
	//items
	public static final Item SAPPHIRE = new ItemBase("Sapphire");
	public static final Item RUBY = new ItemBase("Ruby");
	public static final Item APOLYONIC_ALLOY = new ItemBase("apollyonic_alloy");
	public static final Item APOLYONIC_INGOT = new ItemBase("apollyonic_ingot");
	public static final Item STONE_STICK = new ItemBase("stone_stick");
	
	//tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SPADE = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SPADE = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe",
			MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe",MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe",MATERIAL_SAPPHIRE);
	
	public static final ItemSword APOLLYON_SWORD = new ApollyonSword("apollyon_sword", MATERIAL_APOLLYON);
	public static final ItemSpade APOLLYON_SPADE = new ApollyonSpade("apollyon_shovel", MATERIAL_APOLLYON);
	public static final ItemPickaxe APOLLYON_PICKAXE = new ApollyonPickaxe("apollyon_pickaxe",
			MATERIAL_APOLLYON);
	public static final ItemAxe APOLLYON_AXE = new ApollyonAxe("apollyon_axe",MATERIAL_APOLLYON);
	public static final ItemHoe APOLLYON_HOE = new ApollyonHoe("apollyon_hoe",MATERIAL_APOLLYON);

	
}


