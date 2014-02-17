package com.asyncronous.exo.tiles.machine;

import com.asyncronous.exo.annotation.TileRenderer;
import com.asyncronous.exo.client.render.block.TESRAssembler;
import com.asyncronous.exo.client.render.item.IIRAssembler;
import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.nbt.NBTTagCompound;

@TileRenderer(block = TESRAssembler.class, item= IIRAssembler.class)
public final class TileEntityAssembler extends TileEntityMachine {
    public TileEntityAssembler(){}

    @Override
    public void writeToNBT(NBTTagCompound comp){
        super.writeToNBT(comp);
    }

    @Override
    public void readFromNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }
}