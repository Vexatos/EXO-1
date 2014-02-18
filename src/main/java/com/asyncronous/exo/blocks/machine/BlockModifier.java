package com.asyncronous.exo.blocks.machine;

import com.asyncronous.exo.blocks.BlockMachine;
import com.asyncronous.exo.tiles.machine.TileEntityModifier;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public final class BlockModifier extends BlockMachine {
    public BlockModifier(){
        super();
        this.setBlockName("exo.block.machine.modifier");
        this.setBlockTextureName("exo:machine/modifier");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return Blocks.anvil.getIcon(side, meta);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i){
        return new TileEntityModifier();
    }
}