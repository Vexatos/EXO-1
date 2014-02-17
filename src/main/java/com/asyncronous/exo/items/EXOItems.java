package com.asyncronous.exo.items;

import com.asyncronous.exo.EXO;
import com.asyncronous.exo.items.core.ItemBerzerkCore;
import com.asyncronous.exo.items.core.ItemInfernoCore;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class EXOItems{
    private static EXOItems instance;

    public static final Item ITEM_INFERNO_CORE = new ItemInfernoCore();
    public static final Item ITEM_BERZERK_CORE = new ItemBerzerkCore();

    private EXOItems(){}

    public static EXOItems getInstance(){
        return instance == null ? instance = new EXOItems() : instance;
    }

    public void registerItems(){
        this.register(EXOItems.ITEM_INFERNO_CORE, "exo:infernoCore");
        this.register(EXOItems.ITEM_BERZERK_CORE, "exo:berzerkCore");
    }

    public void register(Item item, String uid){
        GameRegistry.registerItem(item, uid, EXO.MOD_ID);
    }
}