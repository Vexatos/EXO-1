package com.asyncronous.exo.items;

import net.minecraft.item.Item;

public class ItemCore extends ItemEXO{
    public ItemCore(){
        super();
    }

    @Override
    public Item setUnlocalizedName(String name){
        super.setUnlocalizedName("exo.core" + name);
        return this;
    }

    @Override
    public Item setTextureName(String name){
        super.setTextureName("exo:core/" + name);
        return this;
    }
}