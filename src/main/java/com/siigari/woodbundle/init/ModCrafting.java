package com.siigari.woodbundle.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bundleofwood), "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.LOG, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9), ModBlocks.bundleofwood);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tokenwood), "WWW", "WWW", "WWW", 'W', ModBlocks.bundleofwood);
	}
}
