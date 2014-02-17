package com.asyncronous.exo.tiles.machine;

import com.asyncronous.exo.annotation.TileRenderer;
import com.asyncronous.exo.client.render.block.TESRModifier;
import com.asyncronous.exo.client.render.item.IIRModifier;
import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.nbt.NBTTagCompound;

@TileRenderer(block = TESRModifier.class, item= IIRModifier.class)
public final class TileEntityModifier extends TileEntityMachine {
    public TileEntityModifier(){}

    @Override
    public void readFromNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }

    @Override
    public void writeToNBT(NBTTagCompound comp){
        super.readFromNBT(comp);
    }
}