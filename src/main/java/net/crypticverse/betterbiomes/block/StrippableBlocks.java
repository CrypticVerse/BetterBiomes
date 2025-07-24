package net.crypticverse.betterbiomes.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;

public class StrippableBlocks {
    public static void addStrippableBlocks() {
        registerStrippable(BiomeBlocks.MAPLE_LOG, BiomeBlocks.STRIPPED_MAPLE_LOG);
        registerStrippable(BiomeBlocks.MAPLE_WOOD, BiomeBlocks.STRIPPED_MAPLE_WOOD);
    }
    public static void registerStrippable(Block log, Block strippedLog) {
        AxeItem.STRIPPED_BLOCKS = Maps.newHashMap(AxeItem.STRIPPED_BLOCKS);
        AxeItem.STRIPPED_BLOCKS.put(log, strippedLog);
    }
}
