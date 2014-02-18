package com.asyncronous.exo.blocks.machine;

import com.asyncronous.exo.blocks.BlockMachine;
import com.asyncronous.exo.tiles.machine.TileEntityToolbox;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public final class BlockToolbox extends BlockMachine {
    public BlockToolbox(){
        super();
        this.setCreativeTab(null);
        this.setBlockTextureName("toolbox");
        this.setBlockName("toolbox");
        this.setBlockBounds(0.1F, 0.0F, 0.2F, 0.9F, 0.7F, 0.8F);
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
        return new TileEntityToolbox();
    }
}