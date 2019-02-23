package com.DEC0DE.VoidsMod.tools;

import com.DEC0DE.VoidsMod.Main;
import com.DEC0DE.VoidsMod.init.ModItems;
import com.DEC0DE.VoidsMod.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{
	public ToolAxe(String name, ToolMaterial material) {
		super(material,12f, -2.2f);
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
