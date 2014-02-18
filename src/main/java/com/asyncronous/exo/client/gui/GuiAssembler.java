package com.asyncronous.exo.client.gui;

import com.asyncronous.exo.server.gui.ContainerAssembler;
import com.asyncronous.exo.tiles.machine.TileEntityAssembler;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public final class GuiAssembler extends GuiContainer {
    private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/gui/assembler.png");

    public GuiAssembler(InventoryPlayer playerInv, TileEntityAssembler tile){
        super(new ContainerAssembler(playerInv, tile));
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