package com.asyncronous.exo.items;

import com.asyncronous.exo.EXO;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemEXOArmour extends ItemArmor {
    public static final int TYPE_HELM = 0x0;
    public static final int TYPE_CHEST = 0x1;
    public static final int TYPE_LEGS = 0x2;
    public static final int TYPE_BOOTS = 0x3;

    public ItemEXOArmour(int type){
        super(ItemArmor.ArmorMaterial.DIAMOND, 0, type);
        this.setCreativeTab(EXO.TAB);
    }

    @Override
    public Item setUnlocalizedName(String name){
        super.setUnlocalizedName("exo.armor." + name);
        return this;
    }

    @Override
    public Item setTextureName(String name){
        super.setTextureName("exo:amour/" + name);
        return this;
    }
}