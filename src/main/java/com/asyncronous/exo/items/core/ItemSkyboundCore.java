package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemSkyboundCore extends ItemCore {
    public ItemSkyboundCore(){
        super();
        this.setTextureName("skybound");
        this.setUnlocalizedName("skybound");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "skybound";
    }
}