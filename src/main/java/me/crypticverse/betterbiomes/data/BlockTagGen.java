package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.PALM_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.PALM_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)

                .add(BiomeBlocks.STRIPPED_PALM_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG)
                .add(BiomeBlocks.STRIPPED_PALM_LOG);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(BiomeBlocks.MAPLE_LEAVES)
                .add(BiomeBlocks.PALM_LEAVES);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES)
                .add(BiomeBlocks.PALM_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BiomeBlocks.MAPLE_SAPLING)
                .add(BiomeBlocks.PALM_SAPLING);

                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(BiomeBlocks.MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BiomeBlocks.MAPLE_SAPLING);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(BiomeBlocks.MAPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);

    }
}
