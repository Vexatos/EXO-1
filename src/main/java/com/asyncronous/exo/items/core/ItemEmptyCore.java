package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemEmptyCore extends ItemCore {
    public ItemEmptyCore(){
        super();
        this.setTextureName("empty");
        this.setUnlocalizedName("empty");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "empty";
    }
}
