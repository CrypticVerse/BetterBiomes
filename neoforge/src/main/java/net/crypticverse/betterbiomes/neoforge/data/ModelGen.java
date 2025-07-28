package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.util.BiomeBlockFamilies;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ModelGen extends ModelProvider {
    public ModelGen(PackOutput output) {
        super(output, BetterBiomes.MOD_ID);
    }

    @Override
    public void registerModels(BlockModelGenerators blockStateModelGenerator, ItemModelGenerators itemModelGenerator) {
        blockStateModelGenerator.woodProvider(BiomeBlocks.MAPLE_LOG).log(BiomeBlocks.MAPLE_LOG).wood(BiomeBlocks.MAPLE_WOOD);
        blockStateModelGenerator.woodProvider(BiomeBlocks.STRIPPED_MAPLE_LOG).log(BiomeBlocks.STRIPPED_MAPLE_LOG).wood(BiomeBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.createTrivialCube(BiomeBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.createCrossBlock(BiomeBlocks.MAPLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);

        BlockModelGenerators.BlockFamilyProvider maple_pool = blockStateModelGenerator.family(BiomeBlocks.MAPLE_PLANKS);
        maple_pool.generateFor(BiomeBlockFamilies.MAPLE_SIGN);
        maple_pool.generateFor(BiomeBlockFamilies.MAPLE_HANGING_SIGN);

        maple_pool.slab(BiomeBlocks.MAPLE_SLAB);
        maple_pool.stairs(BiomeBlocks.MAPLE_STAIRS);
        maple_pool.fence(BiomeBlocks.MAPLE_FENCE);
        maple_pool.fenceGate(BiomeBlocks.MAPLE_FENCE_GATE);
        maple_pool.button(BiomeBlocks.MAPLE_BUTTON);
        maple_pool.pressurePlate(BiomeBlocks.MAPLE_PRESSURE_PLATE);

        blockStateModelGenerator.createDoor(BiomeBlocks.MAPLE_DOOR);
        blockStateModelGenerator.createTrapdoor(BiomeBlocks.MAPLE_TRAPDOOR);

        itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.TAPPED_BUCKET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.UNCURED_MAPLE_SYRUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.PANCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_PANCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.CHOCOLATE_PANCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.MAPLE_PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BiomeItems.CHOCOLATE_PANCAKE_STACK, ModelTemplates.FLAT_ITEM);
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        List<Block> excluded = List.of(BiomeBlocks.TAPPED_BUCKET);

        return super.getKnownBlocks().filter(entry -> !excluded.contains(entry.value()));
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        List<Item> excluded = new ArrayList<>();

        return super.getKnownItems();
    }
}
