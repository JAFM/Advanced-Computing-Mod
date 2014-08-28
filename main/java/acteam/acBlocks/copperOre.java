package acteam.acBlocks;

import java.util.Random;

import acteam.acItems.ACItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class copperOre extends Block {

	public copperOre(Material material){
		super(material);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("copperOre");
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
		
		GameRegistry.registerBlock(this, "copperOre");
		OreDictionary.registerOre("OreCopper", new ItemStack(this));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1) {
		blockIcon = par1.registerIcon("ac" + ":" + "copper_ore");
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par3){
		return ACItems.copperIngot;
	}
	
}
