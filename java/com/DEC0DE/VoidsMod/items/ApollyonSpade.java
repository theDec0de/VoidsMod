package com.DEC0DE.VoidsMod.items;

import com.DEC0DE.VoidsMod.Main;
import com.DEC0DE.VoidsMod.init.ModItems;
import com.DEC0DE.VoidsMod.util.IHasModel;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ApollyonSpade extends ItemSpade implements IHasModel{
	public ApollyonSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.VOIDSMOD);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}
