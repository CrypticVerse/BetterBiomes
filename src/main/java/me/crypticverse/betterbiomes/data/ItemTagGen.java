package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.util.BetterBiomeTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends FabricTagProvider.ItemTagProvider {
    public ItemTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
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
