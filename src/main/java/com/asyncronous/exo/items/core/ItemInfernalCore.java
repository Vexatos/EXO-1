package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemInfernalCore extends ItemCore {
    public ItemInfernalCore(){
        super();
        this.setTextureName("infernal");
        this.setUnlocalizedName("infernal");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "infernal";
    }
}