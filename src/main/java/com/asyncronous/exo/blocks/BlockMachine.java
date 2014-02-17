package com.asyncronous.exo.blocks;

import com.asyncronous.exo.EXO;
import com.asyncronous.exo.lib.helper.RotationHelper;
import com.asyncronous.exo.tiles.TileEntityMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class BlockMachine extends BlockContainer {
    public BlockMachine(){
        super(Material.iron);
        this.setCreativeTab(EXO.TAB);
    }

    @Override
    public void onBlockPlacedBy(World world,int i, int j, int k, EntityLivingBase living, ItemStack stack){
        ((TileEntityMachine) world.getTileEntity(i, j, k)).setRotation(RotationHelper.get3DRotation(living));
    }
}