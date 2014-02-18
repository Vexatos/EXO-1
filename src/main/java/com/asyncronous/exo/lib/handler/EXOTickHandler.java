package com.asyncronous.exo.lib.handler;

import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.common.gameevent.TickEvent;

public class EXOTickHandler {
    @Subscribe
    public void onClientTick(TickEvent.ClientTickEvent event){

    }

    @Subscribe
    public void onServerTick(TickEvent.ServerTickEvent event){

    }

    @Subscribe
    public void onWorldTick(TickEvent.WorldTickEvent event){

    }

    @Subscribe
    public void onRenderTick(TickEvent.RenderTickEvent event){

    }
}
