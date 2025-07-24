package net.crypticverse.betterbiomes.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;

public class FlammableBlocks {
    public static void registerFlammableBlocks() {

        flammableBlock(BiomeBlocks.MAPLE_LOG, 5, 5);
        flammableBlock(BiomeBlocks.MAPLE_WOOD, 5, 5);
        flammableBlock(BiomeBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        flammableBlock(BiomeBlocks.STRIPPED_MAPLE_WOOD, 5, 5);

        flammableBlock(BiomeBlocks.MAPLE_LEAVES, 30, 60);
        flammableBlock(BiomeBlocks.MAPLE_PLANKS, 5, 20);
    }

    public static void flammableBlock(Block block, int burn, int spread) {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        fireBlock.registerFlammableBlock(block, burn, spread);
    }
}
