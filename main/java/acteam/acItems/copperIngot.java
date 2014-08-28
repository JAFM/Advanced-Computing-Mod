package acteam.acItems;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class copperIngot extends Item {

	public copperIngot(){
		super();
		
		GameRegistry.registerItem(this, "copperIngot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("copperIngot");
		
		OreDictionary.registerOre("IngotCopper", new ItemStack(this));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1) {
		itemIcon = par1.registerIcon("ac" + ":" + "copper_ingot");
	}
	
}
