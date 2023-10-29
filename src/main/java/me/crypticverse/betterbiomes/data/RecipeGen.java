package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.data.recipe.MapleSyrupRecipeBuilder;
import me.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagBuilder;
import net.minecraft.util.Identifier;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Blocks.CRAFTING_TABLE, 1).pattern("PP ").pattern("PP ").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(Blocks.CRAFTING_TABLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4).pattern("P  ").pattern("P  ").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(Items.STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_PICKAXE, 1).pattern("PPP").pattern(" S ").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_AXE, 1).pattern(" PP").pattern(" SP").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_SHOVEL, 1).pattern(" P ").pattern(" S ").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_HOE, 1).pattern("PP ").pattern(" S ").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_SWORD, 1).pattern(" P ").pattern(" P ").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_SWORD)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_BUTTON, 1).input(BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BiomeBlocks.MAPLE_BUTTON)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_BUTTON)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_SLAB, 6).pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_PRESSURE_PLATE, 1).pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE, 3).pattern("PSP").pattern("PSP").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE_GATE, 1).pattern("SPS").pattern("SPS").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_TRAPDOOR, 2).pattern("PPP").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_WOOD, 3).pattern("LL ").pattern("LL ").input('L', BiomeBlocks.MAPLE_LOG).criterion(hasItem(BiomeBlocks.MAPLE_LOG), conditionsFromItem(BiomeBlocks.MAPLE_LOG)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_WOOD)));

        new MapleSyrupRecipeBuilder(BiomeBlocks.MAPLE_LOG, BiomeItems.MAPLE_SYRUP_BOTTLE, 1)
                .criterion(hasItem(BiomeBlocks.MAPLE_LOG), conditionsFromItem(BiomeBlocks.MAPLE_LOG))
                .offerTo(exporter);
    }
}
