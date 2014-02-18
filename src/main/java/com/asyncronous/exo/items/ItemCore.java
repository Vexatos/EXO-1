package com.asyncronous.exo.items;

import com.asyncronous.exo.api.CoreRegistry;
import com.asyncronous.exo.api.ICore;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.input.Keyboard;

import java.util.List;

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

    @Override
    public EnumChatFormatting getCoreNameFormatting(){
        return EnumChatFormatting.DARK_PURPLE;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag){
        if(Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.getKeyCode())){
            list.add(this.getCoreNameFormatting() + "Core Name: " + this.getCoreName());
        }
    }
}