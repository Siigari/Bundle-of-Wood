package com.siigari.woodbundle;

import com.siigari.woodbundle.init.ModBlocks;
import com.siigari.woodbundle.init.ModCrafting;
import com.siigari.woodbundle.init.ModItems;
import com.siigari.woodbundle.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Woodbundle {
	
	@Instance
	public static Woodbundle instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("GUYS! My first mod is coming at you, catch!");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("You caught it; great! Let's register the block.");
		proxy.init();
	
		ModCrafting.register();
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("See you guys in my future release, Heart & Soul: Kingdoms!");
	}

}
