package com.asyncronous.exo.annotation;

import com.asyncronous.exo.client.render.IIR;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TileRenderer{
    Class<? extends TileEntitySpecialRenderer> block();
    Class<? extends IItemRenderer> item() default IIRDummy.class;

    public final class IIRDummy extends IIR{
        public IIRDummy(){
            super(null);
        }

        @Override public void renderItem(ItemRenderType type, ItemStack item, Object... data) {}
    }
}