package com.sevraye.mmt.init;

import com.sevraye.mmt.blocks.BlockFrenchFlag;
import com.sevraye.mmt.reference.Reference;
import com.sevraye.mmt.utility.Names;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final Block frenchFlag = new BlockFrenchFlag();

	public static void init() {
		GameRegistry.registerBlock(frenchFlag, Names.Blocks.FRENCH_FLAG);
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(frenchFlag), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Names.Blocks.FRENCH_FLAG));
	}
}
