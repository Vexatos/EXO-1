package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemMysticCore extends ItemCore {
    public ItemMysticCore(){
        super();
        this.setTextureName("mystic");
        this.setUnlocalizedName("mystic");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "mystic";
    }
}