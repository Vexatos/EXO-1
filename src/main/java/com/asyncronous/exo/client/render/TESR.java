package com.asyncronous.exo.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public abstract class TESR extends TileEntitySpecialRenderer {
    protected final ModelBase MODEL;

    protected TESR(ModelBase model){
        this.MODEL = model;
    }
}