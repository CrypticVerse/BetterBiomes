package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(BiomeBlocks.MAPLE_SAPLING);
        addDrop(BiomeBlocks.MAPLE_PLANKS);
        addDrop(BiomeBlocks.MAPLE_LEAVES);
        addDrop(BiomeBlocks.STRIPPED_MAPLE_LOG);
        addDrop(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(BiomeBlocks.MAPLE_LOG);
        addDrop(BiomeBlocks.STRIPPED_MAPLE_LOG);
        addDrop(BiomeBlocks.PALM_SAPLING);
        addDrop(BiomeBlocks.PALM_PLANKS);
        addDrop(BiomeBlocks.PALM_LEAVES);
        addDrop(BiomeBlocks.STRIPPED_PALM_LOG);
        addDrop(BiomeBlocks.STRIPPED_PALM_WOOD);
        addDrop(BiomeBlocks.PALM_LOG);
        addDrop(BiomeBlocks.STRIPPED_PALM_LOG);
    }
}
