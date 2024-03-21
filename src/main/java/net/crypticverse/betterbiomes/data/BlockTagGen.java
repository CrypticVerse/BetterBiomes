package net.crypticverse.betterbiomes.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomeTags;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG)
                .add(BiomeBlocks.THIN_ACACIA_LOG)
                .add(BiomeBlocks.THIN_BIRCH_LOG)
                .add(BiomeBlocks.THIN_CHERRY_LOG)
                .add(BiomeBlocks.THIN_DARK_OAK_LOG)
                .add(BiomeBlocks.THIN_JUNGLE_LOG)
                .add(BiomeBlocks.THIN_MANGROVE_LOG)
                .add(BiomeBlocks.THIN_OAK_LOG)
                .add(BiomeBlocks.THIN_SPRUCE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_BIRCH_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_CHERRY_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_JUNGLE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_MANGROVE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_OAK_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_SPRUCE_LOG);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG)
                .add(BiomeBlocks.THIN_ACACIA_LOG)
                .add(BiomeBlocks.THIN_BIRCH_LOG)
                .add(BiomeBlocks.THIN_CHERRY_LOG)
                .add(BiomeBlocks.THIN_DARK_OAK_LOG)
                .add(BiomeBlocks.THIN_JUNGLE_LOG)
                .add(BiomeBlocks.THIN_MANGROVE_LOG)
                .add(BiomeBlocks.THIN_OAK_LOG)
                .add(BiomeBlocks.THIN_SPRUCE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_BIRCH_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_CHERRY_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_JUNGLE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_MANGROVE_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_OAK_LOG)
                .add(BiomeBlocks.STRIPPED_THIN_SPRUCE_LOG);

        // Thin log groups
        getOrCreateTagBuilder(BlockTags.ACACIA_LOGS).add(BiomeBlocks.THIN_ACACIA_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        getOrCreateTagBuilder(BlockTags.BIRCH_LOGS).add(BiomeBlocks.THIN_BIRCH_LOG).add(BiomeBlocks.STRIPPED_THIN_BIRCH_LOG);
        getOrCreateTagBuilder(BlockTags.CHERRY_LOGS).add(BiomeBlocks.THIN_CHERRY_LOG).add(BiomeBlocks.STRIPPED_THIN_CHERRY_LOG);
        getOrCreateTagBuilder(BlockTags.DARK_OAK_LOGS).add(BiomeBlocks.THIN_DARK_OAK_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS).add(BiomeBlocks.THIN_JUNGLE_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS).add(BiomeBlocks.THIN_MANGROVE_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        getOrCreateTagBuilder(BlockTags.OAK_LOGS).add(BiomeBlocks.THIN_OAK_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        getOrCreateTagBuilder(BlockTags.SPRUCE_LOGS).add(BiomeBlocks.THIN_SPRUCE_LOG).add(BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
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
