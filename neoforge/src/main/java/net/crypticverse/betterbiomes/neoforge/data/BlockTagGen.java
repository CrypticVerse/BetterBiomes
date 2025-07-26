package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {
    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture, BetterBiomes.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        tag(BlockTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(BiomeBlocks.MAPLE_LEAVES);

        tag(BlockTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES);

        tag(BlockTags.SAPLINGS)
                .add(BiomeBlocks.MAPLE_SAPLING);

        tag(BlockTags.FENCES)
                .add(BiomeBlocks.MAPLE_FENCE);

        tag(BlockTags.FENCE_GATES)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);

        tag(BlockTags.PLANKS)
                .add(BiomeBlocks.MAPLE_PLANKS);
        tag(BlockTags.WOODEN_SLABS)
                .add(BiomeBlocks.MAPLE_SLAB);
        tag(BlockTags.WOODEN_STAIRS)
                .add(BiomeBlocks.MAPLE_STAIRS);
        tag(BlockTags.WOODEN_DOORS)
                .add(BiomeBlocks.MAPLE_DOOR);
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(BiomeBlocks.MAPLE_TRAPDOOR);
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BiomeBlocks.MAPLE_PRESSURE_PLATE);
        tag(BlockTags.WOODEN_BUTTONS)
                .add(BiomeBlocks.MAPLE_BUTTON);
        tag(BlockTags.WOODEN_FENCES)
                .add(BiomeBlocks.MAPLE_FENCE)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);
        tag(BlockTags.WALL_SIGNS)
                .add(BiomeBlocks.WALL_MAPLE_SIGN);
        tag(BlockTags.STANDING_SIGNS)
                .add(BiomeBlocks.STANDING_MAPLE_SIGN);
        tag(BlockTags.WALL_HANGING_SIGNS)
                .add(BiomeBlocks.WALL_HANGING_MAPLE_SIGN);
        tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(BiomeBlocks.HANGING_MAPLE_SIGN);
    }
}
