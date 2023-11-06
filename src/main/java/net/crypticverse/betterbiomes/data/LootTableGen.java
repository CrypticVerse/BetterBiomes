package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(BiomeBlocks.MAPLE_SAPLING);
        addDrop(BiomeBlocks.MAPLE_PLANKS);
        addDrop(BiomeBlocks.MAPLE_LEAVES, leavesDrops(BiomeBlocks.MAPLE_LEAVES, Blocks.AIR, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(BiomeBlocks.STRIPPED_MAPLE_LOG);
        addDrop(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(BiomeBlocks.MAPLE_LOG);
        addDrop(BiomeBlocks.STRIPPED_MAPLE_LOG);

        addDrop(BiomeBlocks.MAPLE_STAIRS);
        addDrop(BiomeBlocks.MAPLE_TRAPDOOR);
        addDrop(BiomeBlocks.MAPLE_FENCE);
        addDrop(BiomeBlocks.MAPLE_FENCE_GATE);
        addDrop(BiomeBlocks.MAPLE_BUTTON);
        addDrop(BiomeBlocks.MAPLE_PRESSURE_PLATE);

        addDrop(BiomeBlocks.MAPLE_SLAB, slabDrops(BiomeBlocks.MAPLE_SLAB));
        addDrop(BiomeBlocks.MAPLE_DOOR, doorDrops(BiomeBlocks.MAPLE_DOOR));
    }
}
