package com.asyncronous.exo.blocks;

import com.asyncronous.exo.blocks.machine.BlockAssembler;
import com.asyncronous.exo.blocks.machine.BlockConstructor;
import net.minecraft.block.Block;

public final class EXOBlocks{
    private static EXOBlocks instance;

    public static final Block BLOCK_ASSEMBLER = new BlockAssembler();
    public static final Block BLOCK_CONSTRUCTOR = new BlockConstructor();

    private EXOBlocks(){}

    public static EXOBlocks getInstance(){
        return instance == null ? instance = new EXOBlocks() : instance;
    }
}