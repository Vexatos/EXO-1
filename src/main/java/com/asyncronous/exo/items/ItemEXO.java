package com.asyncronous.exo.items;

import com.asyncronous.exo.EXO;
import net.minecraft.item.Item;

public class ItemEXO extends Item {
    public ItemEXO(){
        super();
        this.setCreativeTab(EXO.TAB);
    }

    @Override
    public Item setUnlocalizedName(String name){
        super.setUnlocalizedName("exo." + name);
        return this;
    }

    @Override
    public Item setTextureName(String name){
        super.setTextureName("exo:" + name);
        return this;
    }
}