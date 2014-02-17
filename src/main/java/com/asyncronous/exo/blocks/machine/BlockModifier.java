package com.asyncronous.exo.blocks.machine;

import com.asyncronous.exo.blocks.BlockMachine;
import com.asyncronous.exo.tiles.machine.TileEntityModifier;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public final class BlockModifier extends BlockMachine {
    public BlockModifier(){
        super();
        this.setBlockName("exo.block.machine.constructor");
        this.setBlockTextureName("exo:machine/constructor");
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i){
        return new TileEntityModifier();
    }
}