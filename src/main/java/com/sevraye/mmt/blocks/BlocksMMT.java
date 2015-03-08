package com.sevraye.mmt.blocks;

import assets.mmt.creativetab.CreativeTabMMT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksMMT extends Block {
	public BlocksMMT(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabMMT.MMT_TAB);
	}

	public BlocksMMT() {
		this(Material.rock);
	}
}
