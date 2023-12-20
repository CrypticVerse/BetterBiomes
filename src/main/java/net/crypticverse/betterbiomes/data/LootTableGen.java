package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.custom.TappedBucketBlock;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(BiomeBlocks.MAPLE_SAPLING);
        addDrop(BiomeBlocks.MAPLE_PLANKS);
        addDrop(BiomeBlocks.MAPLE_LEAVES, leavesDrops(BiomeBlocks.MAPLE_LEAVES, BiomeBlocks.MAPLE_SAPLING, 0.0025f));
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
        addDrop(BiomeBlocks.STANDING_MAPLE_SIGN);
        addDrop(BiomeBlocks.WALL_MAPLE_SIGN);
        addDrop(BiomeBlocks.HANGING_MAPLE_SIGN);
        addDrop(BiomeBlocks.WALL_HANGING_MAPLE_SIGN);

        addDrop(BiomeBlocks.MAPLE_SLAB, slabDrops(BiomeBlocks.MAPLE_SLAB));
        addDrop(BiomeBlocks.MAPLE_DOOR, doorDrops(BiomeBlocks.MAPLE_DOOR));
    }
}
