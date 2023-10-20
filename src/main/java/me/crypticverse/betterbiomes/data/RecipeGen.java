package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Blocks.CRAFTING_TABLE, 1).pattern("PP ").pattern("PP ").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(Blocks.CRAFTING_TABLE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BiomeBlocks.MAPLE_PLANKS, 4).input(BiomeBlocks.MAPLE_LOG).criterion(hasItem(BiomeBlocks.MAPLE_LOG), FabricRecipeProvider.conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_PLANKS)));
    }
}
