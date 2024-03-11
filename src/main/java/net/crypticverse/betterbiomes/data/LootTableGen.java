package net.crypticverse.betterbiomes.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.world.level.block.Blocks;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(BiomeBlocks.MAPLE_SAPLING);
        dropSelf(BiomeBlocks.MAPLE_PLANKS);
        add(BiomeBlocks.MAPLE_LEAVES, createLeavesDrops(BiomeBlocks.MAPLE_LEAVES, BiomeBlocks.MAPLE_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));
        dropSelf(BiomeBlocks.STRIPPED_MAPLE_LOG);
        dropSelf(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        dropSelf(BiomeBlocks.MAPLE_LOG);
        dropSelf(BiomeBlocks.STRIPPED_MAPLE_LOG);
        dropSelf(BiomeBlocks.MAPLE_SYRUP_BOILER);

        dropSelf(BiomeBlocks.MAPLE_STAIRS);
        dropSelf(BiomeBlocks.MAPLE_TRAPDOOR);
        dropSelf(BiomeBlocks.MAPLE_FENCE);
        dropSelf(BiomeBlocks.MAPLE_FENCE_GATE);
        dropSelf(BiomeBlocks.MAPLE_BUTTON);
        dropSelf(BiomeBlocks.MAPLE_PRESSURE_PLATE);
        dropSelf(BiomeBlocks.STANDING_MAPLE_SIGN);
        dropSelf(BiomeBlocks.HANGING_MAPLE_SIGN);

        add(BiomeBlocks.MAPLE_SLAB, createSlabItemTable(BiomeBlocks.MAPLE_SLAB));
        add(BiomeBlocks.MAPLE_DOOR, createDoorTable(BiomeBlocks.MAPLE_DOOR));
    }
}
