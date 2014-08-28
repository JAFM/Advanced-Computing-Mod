package acteam.ac;

import acteam.acBlocks.ACBlocks;
import acteam.acCrafting.ACCrafting;
import acteam.acItems.ACItems;
import acteam.acWorldGen.ACWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="AC", version="1.0.0", name="Advanced Computing")

public class ac {

	@SidedProxy(clientSide="acteam.ac.client.ACClientProxy", serverSide="acteam.ac.ACCommonProxy")
	public static ACCommonProxy Proxy;
	
	@Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {	
    	
    	Proxy.registerRenderers();
    	
    	ACItems.init();
    	ACCrafting.init();
    	ACBlocks.init();
    	
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new ACWorldGenerator(), 1000);
    }
    
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	
    }
	
}
