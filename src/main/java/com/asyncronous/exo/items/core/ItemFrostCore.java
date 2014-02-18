package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemFrostCore extends ItemCore {
    public ItemFrostCore(){
        super();
        this.setTextureName("frost");
        this.setUnlocalizedName("frost");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "frost";
    }
}