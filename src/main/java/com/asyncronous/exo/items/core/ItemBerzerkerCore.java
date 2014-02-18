package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemBerzerkerCore extends ItemCore {
    public ItemBerzerkerCore(){
        super();
        this.setTextureName("berzerker");
        this.setUnlocalizedName("berzerker");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "berzerker";
    }
}