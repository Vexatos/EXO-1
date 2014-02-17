package com.asyncronous.exo.client;

import com.asyncronous.exo.annotation.TileRenderer;
import com.asyncronous.exo.server.ServerProxy;
import com.asyncronous.exo.tiles.machine.TileEntityAssembler;
import com.asyncronous.exo.tiles.machine.TileEntityModifier;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public final class ClientProxy extends ServerProxy{
    @Override
    public ClientProxy initTiles()
    throws Exception{
        this.registerTile(TileEntityAssembler.class);
        this.registerTile(TileEntityModifier.class);
        return this;
    }

    private void registerTile(Class<? extends TileEntity> tile){
        GameRegistry.registerTileEntity(tile, "exo:tileEntity" + tile.getSimpleName().replace("TileEntity", ""));
    }

    @Override
    public ClientProxy initRenders()
    throws Exception{
        this.registerTileRenderer(TileEntityAssembler.class);
        this.registerTileRenderer(TileEntityModifier.class);
        return this;
    }

    private void registerTileRenderer(Class<? extends TileEntity> tile)
    throws Exception{
        ClientRegistry.bindTileEntitySpecialRenderer(tile, this.getNewRendererInstance(tile));
    }

    private TileEntitySpecialRenderer getNewRendererInstance(Class<? extends TileEntity> tile)
    throws Exception{
        if(!tile.isAnnotationPresent(TileRenderer.class)){
            throw new IllegalStateException("Cannot find valid @TileRenderer annotation for TileEntity class " + tile.getName());
        }

        return tile.getAnnotation(TileRenderer.class).value().newInstance();
    }

    @Override
    public ClientProxy init()
    throws Exception{
        return this;
    }
}