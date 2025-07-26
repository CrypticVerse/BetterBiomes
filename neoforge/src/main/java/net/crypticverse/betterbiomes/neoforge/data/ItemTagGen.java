package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {
    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, BetterBiomes.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(ItemTags.PLANKS)
                .add(BiomeBlocks.MAPLE_PLANKS.asItem());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG.asItem())
                .add(BiomeBlocks.MAPLE_WOOD.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD.asItem());
        tag(ItemTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES.asItem());

    }
}
