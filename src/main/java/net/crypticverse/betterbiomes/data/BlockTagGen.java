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
        valueLookupBuilder(BlockTags.LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);

        valueLookupBuilder(BlockTags.HOE_MINEABLE)
                .add(BiomeBlocks.MAPLE_LEAVES);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(BiomeBlocks.MAPLE_LEAVES);

        valueLookupBuilder(BlockTags.SAPLINGS)
                .add(BiomeBlocks.MAPLE_SAPLING);

        valueLookupBuilder(BlockTags.FENCES)
                .add(BiomeBlocks.MAPLE_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(BiomeBlocks.MAPLE_PLANKS);
        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(BiomeBlocks.MAPLE_SLAB);
        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(BiomeBlocks.MAPLE_STAIRS);
        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(BiomeBlocks.MAPLE_DOOR);
        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BiomeBlocks.MAPLE_TRAPDOOR);
        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BiomeBlocks.MAPLE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BiomeBlocks.MAPLE_BUTTON);
        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(BiomeBlocks.MAPLE_FENCE)
                .add(BiomeBlocks.MAPLE_FENCE_GATE);
        valueLookupBuilder(BlockTags.WALL_SIGNS)
                .add(BiomeBlocks.WALL_MAPLE_SIGN);
        valueLookupBuilder(BlockTags.STANDING_SIGNS)
                .add(BiomeBlocks.STANDING_MAPLE_SIGN);
        valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(BiomeBlocks.WALL_HANGING_MAPLE_SIGN);
        valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(BiomeBlocks.HANGING_MAPLE_SIGN);

        valueLookupBuilder(BetterBiomeTags.Blocks.MAPLE_LOGS)
                .add(BiomeBlocks.MAPLE_LOG)
                .add(BiomeBlocks.MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_WOOD)
                .add(BiomeBlocks.STRIPPED_MAPLE_LOG);
    }
}
