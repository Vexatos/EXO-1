package com.asyncronous.exo.items.core;

import com.asyncronous.exo.items.ItemCore;

public final class ItemBulldozerCore extends ItemCore{
    public ItemBulldozerCore(){
        super();
        this.setTextureName("bulldozer");
        this.setUnlocalizedName("bulldozer");
    }

    @Override
    public void onTickAction() {

    }

    @Override
    public String getCoreName() {
        return "nulldozer";
    }
}