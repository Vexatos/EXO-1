package com.asyncronous.exo.client.render.item;

import com.asyncronous.exo.client.model.machine.ModelAssembler;
import com.asyncronous.exo.client.render.IIR;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class IIRAssembler extends IIR {
    private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/blocks/machine/assembler.png");

    public IIRAssembler(){
        super(new ModelAssembler());
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch(type)
        {
            case ENTITY:{
                this.renderOnState(0.0F, 0.65F, 0.0F, 0.75F);
                return;
            }
            case EQUIPPED:{
                this.renderOnState(0.0F, 0.65F, 0.0F, 0.75F);
                return;
            }
            case INVENTORY:{
                this.renderOnState(0.0F, 0.65F, 0.0F, 0.75F);
                return;
            }
            default:{
                return;
            }
        }
    }

    private void renderOnState(float i, float j, float k, float scale){
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
        GL11.glPushMatrix();
        RenderHelper.enableStandardItemLighting();
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(i, j, k);
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.MODEL.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glDisable(GL11.GL_BLEND);
        RenderHelper.disableStandardItemLighting();
        GL11.glPopMatrix();
        return;
    }
}