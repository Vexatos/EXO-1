package com.asyncronous.exo.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMachine extends TileEntity {
    protected float rot = 0.0F;

    public void setRotation(float rot){
        this.rot = rot;
    }

    public float getRotation(){
        return this.rot;
    }

    @Override
    public void readFromNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }

    @Override
    public void writeToNBT(NBTTagCompound comp){
        super.writeToNBT(comp);
    }
}