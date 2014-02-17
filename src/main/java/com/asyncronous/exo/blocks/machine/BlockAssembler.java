package com.asyncronous.exo.blocks.machine;

import com.asyncronous.exo.blocks.BlockMachine;
import com.asyncronous.exo.tiles.machine.TileEntityAssembler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public final class BlockAssembler extends BlockMachine {
    public BlockAssembler(){
        super();
        this.setBlockName("exo.block.machine.assembler");
        this.setBlockTextureName("exo:machine/assembler");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i){
        return new TileEntityAssembler();
    }
}