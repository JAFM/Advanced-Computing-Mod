package acteam.acWorldGen;

import java.util.Random;

import acteam.acBlocks.ACBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ACWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX *16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	private void generateEnd(World world, Random random, int i, int j) {}
	
	private void generateSurface(World world, Random random, int i, int j) {
        for(int k = 0; k < 20; k++){
			int CopperXCoord = i + random.nextInt(16);
			int CopperYCoord = random.nextInt(50);
			int CopperZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ACBlocks.copperOre, 13)).generate(world, random, CopperXCoord, CopperYCoord, CopperZCoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {}
	
}
