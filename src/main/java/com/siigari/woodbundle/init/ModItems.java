package com.siigari.woodbundle.init;

import com.siigari.woodbundle.Reference;
import com.siigari.woodbundle.items.ItemTokenWood;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item tokenwood;

	public static void init() {
		tokenwood = new ItemTokenWood();
		
	}
	
	public static void register() {
		GameRegistry.register(tokenwood);
		
	}
	
	public static void registerRenders() {
		registerRender(tokenwood);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
