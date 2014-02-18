package com.asyncronous.exo.tiles.machine;

import com.asyncronous.exo.annotation.TileRenderer;
import com.asyncronous.exo.client.render.block.TESRToolbox;
import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.nbt.NBTTagCompound;

@TileRenderer(block = TESRToolbox.class)
public final class TileEntityToolbox extends TileEntityMachine {
    public TileEntityToolbox(){}

    @Override
    public void readFromNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }

    @Override
    public void writeToNBT(NBTTagCompound comp){
        super.writeToNBT(comp);
    }
}