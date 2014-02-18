package com.asyncronous.exo.lib.handler;

import com.asyncronous.exo.client.gui.GuiAssembler;
import com.asyncronous.exo.client.gui.GuiModifier;
import com.asyncronous.exo.lib.EXOConstants;
import com.asyncronous.exo.server.gui.ContainerAssembler;
import com.asyncronous.exo.server.gui.ContainerModifier;
import com.asyncronous.exo.tiles.machine.TileEntityAssembler;
import com.asyncronous.exo.tiles.machine.TileEntityModifier;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public final class EXOGuiHandler implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int i, int j, int k) {
        switch(ID)
        {
            case EXOConstants.GUI_ASSEMBLER:{
                return new ContainerAssembler(player.inventory, (TileEntityAssembler) world.getTileEntity(i, j, k));
            }
            case EXOConstants.GUI_MODIFIER:{
                return new ContainerModifier(player.inventory, (TileEntityModifier) world.getTileEntity(i, j, k));
            }
            case EXOConstants.GUI_TOOLBOX:{
            }
            default:{
                return null;
            }
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int i, int j, int k) {
        switch(ID)
        {
            case EXOConstants.GUI_ASSEMBLER:{
                return new GuiAssembler(player.inventory, (TileEntityAssembler) world.getTileEntity(i, j, k));
            }
            case EXOConstants.GUI_MODIFIER:{
                return new GuiModifier(player.inventory, (TileEntityModifier) world.getTileEntity(i, j, k));
            }
            case EXOConstants.GUI_TOOLBOX:{
            }
            default:{
                return null;
            }
        }
    }
}