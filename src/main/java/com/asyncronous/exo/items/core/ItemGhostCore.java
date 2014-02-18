package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemGhostCore extends ItemCore {
    public ItemGhostCore(){
        super();
        this.setTextureName("ghost");
        this.setUnlocalizedName("ghost");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "ghost";
    }
}
