package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemAssassinCore extends ItemCore {
    public ItemAssassinCore(){
        super();
        this.setTextureName("assassin");
        this.setUnlocalizedName("assassin");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName(){
        return "assassin";
    }
}