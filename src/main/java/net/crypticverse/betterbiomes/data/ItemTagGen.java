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
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD.asItem())
                .add(BiomeBlocks.THIN_ACACIA_LOG.asItem())
                .add(BiomeBlocks.THIN_BIRCH_LOG.asItem())
                .add(BiomeBlocks.THIN_CHERRY_LOG.asItem())
                .add(BiomeBlocks.THIN_DARK_OAK_LOG.asItem())
                .add(BiomeBlocks.THIN_JUNGLE_LOG.asItem())
                .add(BiomeBlocks.THIN_MANGROVE_LOG.asItem())
                .add(BiomeBlocks.THIN_OAK_LOG.asItem())
                .add(BiomeBlocks.THIN_SPRUCE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_BIRCH_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_CHERRY_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_OAK_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.ACACIA_LOGS).add(BiomeBlocks.THIN_ACACIA_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.BIRCH_LOGS).add(BiomeBlocks.THIN_BIRCH_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_BIRCH_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.CHERRY_LOGS).add(BiomeBlocks.THIN_CHERRY_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_CHERRY_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.DARK_OAK_LOGS).add(BiomeBlocks.THIN_DARK_OAK_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.JUNGLE_LOGS).add(BiomeBlocks.THIN_JUNGLE_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.MANGROVE_LOGS).add(BiomeBlocks.THIN_MANGROVE_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.OAK_LOGS).add(BiomeBlocks.THIN_OAK_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_OAK_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.SPRUCE_LOGS).add(BiomeBlocks.THIN_SPRUCE_LOG.asItem()).add(BiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES.asItem());

        getOrCreateTagBuilder(BetterBiomeTags.Items.MAPLE_LOGS)
                .add(BiomeBlocks.MAPLE_LOG.asItem())
                .add(BiomeBlocks.MAPLE_WOOD.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD.asItem());

    }
}
