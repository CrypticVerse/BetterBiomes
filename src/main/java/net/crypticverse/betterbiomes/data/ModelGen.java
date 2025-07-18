package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.util.BiomeBlockFamilies;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.createLogTexturePool(BiomeBlocks.MAPLE_LOG).log(BiomeBlocks.MAPLE_LOG).wood(BiomeBlocks.MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(BiomeBlocks.STRIPPED_MAPLE_LOG).log(BiomeBlocks.STRIPPED_MAPLE_LOG).wood(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(BiomeBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(BiomeBlocks.MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool maple_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BiomeBlocks.MAPLE_PLANKS);
        maple_pool.family(BiomeBlockFamilies.MAPLE_SIGN);
        maple_pool.family(BiomeBlockFamilies.MAPLE_HANGING_SIGN);

        maple_pool.slab(BiomeBlocks.MAPLE_SLAB);
        maple_pool.stairs(BiomeBlocks.MAPLE_STAIRS);
        maple_pool.fence(BiomeBlocks.MAPLE_FENCE);
        maple_pool.fenceGate(BiomeBlocks.MAPLE_FENCE_GATE);
        maple_pool.button(BiomeBlocks.MAPLE_BUTTON);
        maple_pool.pressurePlate(BiomeBlocks.MAPLE_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(BiomeBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BiomeBlocks.MAPLE_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(BetterBiomeFluids.MAPLE_SYRUP_BUCKET, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.MAPLE_BOAT, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.MAPLE_CHEST_BOAT, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.TAPPED_BUCKET, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.TAPPED_MAPLE_SAP_BUCKET, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.UNCURED_MAPLE_SYRUP, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.PANCAKE, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.MAPLE_PANCAKE, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.CHOCOLATE_PANCAKE, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.PANCAKE_STACK, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.MAPLE_PANCAKE_STACK, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.CHOCOLATE_PANCAKE_STACK, Models.GENERATED);
    }
}
