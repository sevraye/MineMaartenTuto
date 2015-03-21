package com.sevraye.mmt.blocks;

import com.sevraye.mmt.utility.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

public class BlockFrenchFlag extends BlocksMMT {
	public BlockFrenchFlag() {
		super();
		this.setUnlocalizedName(Names.Blocks.FRENCH_FLAG);
		this.setTickRandomly(true);
		// TODO Add a texture to this f*****g block.
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (rand.nextInt(10) == 0) {
			worldIn.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), "mmt:flagFlap", 1.0F, rand.nextFloat() + 0.5F);
		}
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		worldIn.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), "mmt:flagFlap", 1.0F, playerIn.getRNG().nextFloat() + 0.5F);
		return true;
	}
}
