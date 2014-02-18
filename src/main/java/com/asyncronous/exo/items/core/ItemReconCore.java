package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemReconCore extends ItemCore {
    public ItemReconCore(){
        super();
        this.setTextureName("recon");
        this.setUnlocalizedName("recon");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "recon";
    }
}