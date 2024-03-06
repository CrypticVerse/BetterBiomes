package net.crypticverse.betterbiomes.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BiomeItems;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.woodProvider(BiomeBlocks.MAPLE_LOG).log(BiomeBlocks.MAPLE_LOG).wood(BiomeBlocks.MAPLE_WOOD);
        blockStateModelGenerator.woodProvider(BiomeBlocks.STRIPPED_MAPLE_LOG).log(BiomeBlocks.STRIPPED_MAPLE_LOG).wood(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.createTrivialCube(BiomeBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.createCrossBlock(BiomeBlocks.MAPLE_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createNonTemplateModelBlock(BiomeBlocks.MAPLE_SYRUP_BOILER);

        BlockModelGenerators.BlockFamilyProvider maplePool = blockStateModelGenerator.family(BiomeBlocks.MAPLE_PLANKS);
        maplePool.slab(BiomeBlocks.MAPLE_SLAB);
        maplePool.stairs(BiomeBlocks.MAPLE_STAIRS);
        maplePool.fence(BiomeBlocks.MAPLE_FENCE);
        maplePool.fenceGate(BiomeBlocks.MAPLE_FENCE_GATE);
        maplePool.button(BiomeBlocks.MAPLE_BUTTON);
        maplePool.pressurePlate(BiomeBlocks.MAPLE_PRESSURE_PLATE);

        blockStateModelGenerator.createDoor(BiomeBlocks.MAPLE_DOOR);
        blockStateModelGenerator.createTrapdoor(BiomeBlocks.MAPLE_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
            itemModelGenerator.generateFlatItem(BetterBiomeFluids.MAPLE_SYRUP_BUCKET, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_SYRUP_BOTTLE, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.HANGING_MAPLE_SIGN, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_SIGN, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_BOAT, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.TAPPED_BUCKET, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.UNCURED_MAPLE_SYRUP, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.PANCAKE, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_PANCAKE, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.CHOCOLATE_PANCAKE, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
            itemModelGenerator.generateFlatItem(BiomeItems.CHOCOLATE_PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
    }
}
