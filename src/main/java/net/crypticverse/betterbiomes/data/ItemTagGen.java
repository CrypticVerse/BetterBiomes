package net.crypticverse.betterbiomes.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomeTags;

public class ItemTagGen extends FabricTagProvider.ItemTagProvider {
    public ItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(BiomeBlocks.MAPLE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG.asItem())
                .add(BiomeBlocks.MAPLE_WOOD.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES.asItem());
        getOrCreateTagBuilder(BetterBiomeTags.Items.MAPLE_LOGS)
                .add(BiomeBlocks.MAPLE_LOG.asItem())
                .add(BiomeBlocks.MAPLE_WOOD.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD.asItem());

    }
}
