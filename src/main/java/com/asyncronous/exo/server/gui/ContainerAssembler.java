package com.asyncronous.exo.server.gui;

import com.asyncronous.exo.tiles.machine.TileEntityAssembler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;

public final class ContainerAssembler extends Container {
    private final InventoryCraftResult CRAFT_RESULT = new InventoryCraftResult();

    public ContainerAssembler(InventoryPlayer playerInv, TileEntityAssembler tile){
        this.bindPlayerInventory(playerInv);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    private void bindPlayerInventory(InventoryPlayer playerInv){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 9; y++){
                this.addSlotToContainer(new Slot(playerInv, (y + x * 9 + 9), (8 + y * 18), (84 + x * 18)));
            }
        }

        for(int y = 0; y < 9; y++){
            this.addSlotToContainer(new Slot(playerInv, y, (8 + y * 18), 142));
        }
    }
}