package com.asyncronous.exo.items;

import com.asyncronous.exo.blocks.EXOBlocks;
import com.asyncronous.exo.lib.helper.RotationHelper;
import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class ItemToolbox extends ItemEXO{
    public ItemToolbox(){
        super();
        this.setUnlocalizedName("toolbox");
        this.setTextureName("toolbox");
        this.setMaxStackSize(1);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int side, float bI, float bJ, float bK){
        if(world.isAirBlock(i, j + 1, k)){
            world.setBlock(i, j + 1, k, EXOBlocks.BLOCK_TOOLBOX);
            ((TileEntityMachine) world.getTileEntity(i, j + 1, k)).setRotation(RotationHelper.get3DRotation(player));
        }

        return true;
    }
}