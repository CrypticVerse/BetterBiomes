package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomeTags;
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
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
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

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(BiomeBlocks.MAPLE_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(BiomeBlocks.MAPLE_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(BiomeBlocks.MAPLE_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BiomeBlocks.MAPLE_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BiomeBlocks.MAPLE_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BiomeBlocks.MAPLE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BiomeBlocks.MAPLE_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(BiomeBlocks.MAPLE_FENCE)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(BiomeBlocks.WALL_MAPLE_SIGN);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(BiomeBlocks.STANDING_MAPLE_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(BiomeBlocks.WALL_HANGING_MAPLE_SIGN);
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(BiomeBlocks.HANGING_MAPLE_SIGN);

        getOrCreateTagBuilder(BetterBiomeTags.Blocks.MAPLE_LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);
    }
}
