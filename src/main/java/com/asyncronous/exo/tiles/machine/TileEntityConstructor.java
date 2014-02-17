package com.asyncronous.exo.tiles.machine;

import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.nbt.NBTTagCompound;

public final class TileEntityConstructor extends TileEntityMachine {
    public TileEntityConstructor(){}

    @Override
    public void readFromNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }

    @Override
    public void writeToNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }
}