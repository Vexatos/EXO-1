package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemReflexCore extends ItemCore {
    public ItemReflexCore(){
        super();
        this.setUnlocalizedName("reflex");
        this.setTextureName("reflex");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "reflex";
    }
}