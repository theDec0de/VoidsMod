package com.DEC0DE.VoidsMod.items;

import com.DEC0DE.VoidsMod.Main;
import com.DEC0DE.VoidsMod.init.ModItems;
import com.DEC0DE.VoidsMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.VOIDSMOD);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
	
}
