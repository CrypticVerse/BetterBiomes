package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Me realizing it relies on tags not items. lol
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_BUTTON, 1).input(BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BiomeBlocks.MAPLE_BUTTON)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_BUTTON)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_SLAB, 6).pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_PRESSURE_PLATE, 1).pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE, 3).pattern("PSP").pattern("PSP").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE_GATE, 1).pattern("SPS").pattern("SPS").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_TRAPDOOR, 2).pattern("PPP").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_WOOD, 3).pattern("LL ").pattern("LL ").input('L', BiomeBlocks.MAPLE_LOG).criterion(hasItem(BiomeBlocks.MAPLE_LOG), conditionsFromItem(BiomeBlocks.MAPLE_LOG)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_BOAT, 1).pattern("P P").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS),conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.MAPLE_BOAT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_CHEST_BOAT, 1).pattern(" C ").pattern(" B ").input('B', BiomeItems.MAPLE_BOAT).input('C', Blocks.CHEST).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.MAPLE_CHEST_BOAT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_SIGN, 3).pattern("PPP").pattern("PPP").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS),conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.MAPLE_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, BiomeItems.HANGING_MAPLE_SIGN, 6).pattern("C C").pattern("LLL").pattern("LLL").input('L', BiomeBlocks.STRIPPED_MAPLE_LOG).input('C', Blocks.CHAIN).criterion(hasItem(BiomeBlocks.STRIPPED_MAPLE_LOG),conditionsFromItem(BiomeBlocks.STRIPPED_MAPLE_LOG)).criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.HANGING_MAPLE_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.MAPLE_SYRUP_BOILER, 1).pattern("IGI").pattern("III").pattern("ILI").input('I', Items.IRON_INGOT).input('G', Items.GLASS).input('L', Items.LAVA_BUCKET).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS)).criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.MAPLE_SYRUP_BOILER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeItems.UNCURED_MAPLE_SYRUP, 4).pattern(" G ").pattern("GBG").pattern(" G ").input('G', Items.GLASS).input('B', BiomeItems.TAPPED_MAPLE_SAP_BUCKET).criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS)).criterion(hasItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), conditionsFromItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.UNCURED_MAPLE_SYRUP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.PANCAKE ,3).pattern("WMW").pattern(" E ").pattern("WSW").input('W', Items.WHEAT).input('E', Items.EGG).input('S', Items.SUGAR).input('M', Items.MILK_BUCKET).criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT)).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG)).criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR)).criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.PANCAKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.PANCAKE).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.PANCAKE_STACK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.MAPLE_PANCAKE).criterion(hasItem(BiomeItems.MAPLE_PANCAKE), conditionsFromItem(BiomeItems.MAPLE_PANCAKE)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.MAPLE_PANCAKE_STACK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.CHOCOLATE_PANCAKE).criterion(hasItem(BiomeItems.CHOCOLATE_PANCAKE), conditionsFromItem(BiomeItems.CHOCOLATE_PANCAKE)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.CHOCOLATE_PANCAKE_STACK)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE, 1).input(BiomeItems.PANCAKE).input(BiomeItems.MAPLE_SYRUP_BOTTLE).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).criterion(hasItem(BiomeItems.MAPLE_SYRUP_BOTTLE), conditionsFromItem(BiomeItems.MAPLE_SYRUP_BOTTLE)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.MAPLE_PANCAKE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE, 1).input(BiomeItems.PANCAKE).input(Items.COCOA_BEANS).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS)).offerTo(exporter, new Identifier(getRecipeName(BiomeItems.CHOCOLATE_PANCAKE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BiomeBlocks.TAPPED_BUCKET, 1).input(Items.BUCKET).input(Items.IRON_INGOT).criterion(hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(BiomeBlocks.TAPPED_BUCKET)));
    }
}
