package com.asyncronous.exo.items;

import com.asyncronous.exo.api.CoreRegistry;
import com.asyncronous.exo.api.ICore;
import net.minecraft.item.Item;

public abstract class ItemCore extends ItemEXO implements ICore {
    public ItemCore(){
        super();
        CoreRegistry.INSTANCE.registerCore(this);
    }

    @Override
    public Item setUnlocalizedName(String name){
        super.setUnlocalizedName("core." + name);
        return this;
    }

    @Override
    public Item setTextureName(String name){
        super.setTextureName("core/" + name);
        return this;
    }
}