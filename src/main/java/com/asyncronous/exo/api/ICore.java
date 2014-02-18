package com.asyncronous.exo.api;

import net.minecraft.util.EnumChatFormatting;

public interface ICore{
    public void onTickAction();
    public String getCoreName();
    public EnumChatFormatting getCoreNameFormatting();
}