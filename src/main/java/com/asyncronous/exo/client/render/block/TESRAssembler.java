package com.asyncronous.exo.client.render.block;

import com.asyncronous.exo.client.model.machine.ModelAssembler;
import com.asyncronous.exo.client.render.TESR;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class TESRAssembler extends TESR {
    private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/blocks/assembler");

    public TESRAssembler(){
        super(new ModelAssembler());
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double i, double j, double k, float partial){
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
        GL11.glPushMatrix();
        RenderHelper.enableStandardItemLighting();
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glTranslatef((float) i + 0.5F, (float) j + 1.5F, (float) k + 0.5F);
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.MODEL.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glDisable(GL11.GL_BLEND);
        RenderHelper.disableStandardItemLighting();
        GL11.glPopMatrix();
    }
}