package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LootTableGen extends BlockLootSubProvider {
    public LootTableGen(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        dropSelf(BiomeBlocks.MAPLE_SAPLING);
        dropSelf(BiomeBlocks.MAPLE_PLANKS);
        add(BiomeBlocks.MAPLE_LEAVES, createLeavesDrops(BiomeBlocks.MAPLE_LEAVES, BiomeBlocks.MAPLE_SAPLING, 0.0025f));
        dropSelf(BiomeBlocks.STRIPPED_MAPLE_LOG);
        dropSelf(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        dropSelf(BiomeBlocks.MAPLE_LOG);
        dropSelf(BiomeBlocks.MAPLE_WOOD);
        dropOther(BiomeBlocks.TAPPED_BUCKET, BiomeItems.TAPPED_MAPLE_SAP_BUCKET);

        dropSelf(BiomeBlocks.MAPLE_STAIRS);
        dropSelf(BiomeBlocks.MAPLE_TRAPDOOR);
        dropSelf(BiomeBlocks.MAPLE_FENCE);
        dropSelf(BiomeBlocks.MAPLE_FENCE_GATE);
        dropSelf(BiomeBlocks.MAPLE_BUTTON);
        dropSelf(BiomeBlocks.MAPLE_PRESSURE_PLATE);
        dropSelf(BiomeBlocks.STANDING_MAPLE_SIGN);
        dropSelf(BiomeBlocks.WALL_MAPLE_SIGN);
        dropSelf(BiomeBlocks.HANGING_MAPLE_SIGN);
        dropSelf(BiomeBlocks.WALL_HANGING_MAPLE_SIGN);

        add(BiomeBlocks.MAPLE_SLAB, createSlabItemTable(BiomeBlocks.MAPLE_SLAB));
        add(BiomeBlocks.MAPLE_DOOR, createDoorTable(BiomeBlocks.MAPLE_DOOR));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.entrySet().stream().filter(e -> e.getKey().identifier().getNamespace().equals(BetterBiomes.MOD_ID)).map(Map.Entry::getValue).toList();
    }

    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        return new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(LootTableGen::new, LootContextParamSets.BLOCK)), provider);
    }
}
