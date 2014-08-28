package acteam.acBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ACBlocks {
	
	public static Block copperOre;
	
	public static void init(){
		copperOre = new copperOre(Material.iron);
	}

}
