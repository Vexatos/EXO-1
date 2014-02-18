package com.asyncronous.exo.client.gui;

import com.asyncronous.exo.server.gui.ContainerModifier;
import com.asyncronous.exo.tiles.machine.TileEntityModifier;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class GuiModifier extends GuiContainer{
    private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/gui/modifier.png");

    public GuiModifier(InventoryPlayer playerInv, TileEntityModifier tile){
        super(new ContainerModifier(playerInv, tile));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
    }

    @Override
    public void drawGuiContainerForegroundLayer(int i, int j){

    }
}