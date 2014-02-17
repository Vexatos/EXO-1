package com.asyncronous.exo.items.misc;

import com.asyncronous.exo.items.ItemEXO;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public final class ItemIngot extends ItemEXO {
    public static final String[] NAMES = new String[]{
            "steel", "pigIron"
    };
    private final IIcon[] ICONS = new IIcon[ItemIngot.NAMES.length];

    public ItemIngot(){
        super();
        this.setUnlocalizedName("misc.exoIngot");
        this.setTextureName("misc/ingot");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage){
        return this.ICONS[damage];
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        return String.format("%s.%s", super.getUnlocalizedName(), ItemIngot.NAMES[stack.getItemDamage()]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for(int i = 0; i < ItemIngot.NAMES.length; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register){
        for(int i = 0; i < ItemIngot.NAMES.length; i++){
            this.ICONS[i] = register.registerIcon(super.getIconString() + "/" + ItemIngot.NAMES[i]);
        }
    }
}