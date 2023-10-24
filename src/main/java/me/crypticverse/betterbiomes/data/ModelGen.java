package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import me.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(BiomeBlocks.MAPLE_LOG).log(BiomeBlocks.MAPLE_LOG).wood(BiomeBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(BiomeBlocks.STRIPPED_MAPLE_LOG).log(BiomeBlocks.STRIPPED_MAPLE_LOG).wood(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(BiomeBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(BiomeBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(BiomeBlocks.MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleState(BiomeBlocks.MAPLE_SYRUP_BOILER);


        blockStateModelGenerator.registerLog(BiomeBlocks.PALM_LOG).log(BiomeBlocks.PALM_LOG).wood(BiomeBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(BiomeBlocks.STRIPPED_PALM_LOG).log(BiomeBlocks.STRIPPED_PALM_LOG).wood(BiomeBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(BiomeBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(BiomeBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(BiomeBlocks.PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(BetterBiomeFluids.MAPLE_SYRUP_BUCKET, Models.GENERATED);
            itemModelGenerator.register(BiomeItems.MAPLE_SYRUP_BOTTLE, Models.GENERATED);
    }
}
