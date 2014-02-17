package com.asyncronous.exo.annotation;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TileRenderer{
    Class<? extends TileEntitySpecialRenderer> value();
}