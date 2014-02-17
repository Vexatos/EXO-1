package com.asyncronous.exo.blocks;

import com.asyncronous.exo.blocks.machine.BlockAssembler;
import com.asyncronous.exo.blocks.machine.BlockModifier;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class EXOBlocks{
    private static EXOBlocks instance;

    public static final Block BLOCK_ASSEMBLER = new BlockAssembler();
    public static final Block BLOCK_MODIFIER = new BlockModifier();

    private EXOBlocks(){}

    public static EXOBlocks getInstance(){
        return instance == null ? instance = new EXOBlocks() : instance;
    }

    public void registerBlocks(){
        this.register(EXOBlocks.BLOCK_ASSEMBLER, "assembler");
        this.register(EXOBlocks.BLOCK_MODIFIER, "constructor");
    }

    public void register(Block b, String id){
        GameRegistry.registerBlock(b, "exo:" + id);
    }
}