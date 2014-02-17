package com.asyncronous.exo.blocks;

import com.asyncronous.exo.EXO;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockMachine extends BlockContainer {
    public BlockMachine(){
        super(Material.iron);
        this.setCreativeTab(EXO.TAB);
    }
}