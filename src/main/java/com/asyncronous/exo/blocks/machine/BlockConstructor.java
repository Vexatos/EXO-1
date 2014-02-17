package com.asyncronous.exo.blocks.machine;

import com.asyncronous.exo.blocks.BlockMachine;
import com.asyncronous.exo.tiles.machine.TileEntityConstructor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public final class BlockConstructor extends BlockMachine {
    public BlockConstructor(){
        super();
        this.setBlockName("exo.block.machine.constructor");
        this.setBlockTextureName("exo:machine/constructor");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i){
        return new TileEntityConstructor();
    }
}