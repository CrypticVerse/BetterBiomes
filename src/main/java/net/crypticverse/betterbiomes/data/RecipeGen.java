package net.crypticverse.betterbiomes.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BiomeBlocks.MAPLE_BUTTON, 1).requires(BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), FabricRecipeProvider.has(BiomeBlocks.MAPLE_BUTTON)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_BUTTON)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_SLAB, 6).pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_PRESSURE_PLATE, 1).pattern(" PP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_PRESSURE_PLATE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE, 3).pattern("PSP").pattern("PSP").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_FENCE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE_GATE, 1).pattern("SPS").pattern("SPS").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_FENCE_GATE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_DOOR)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_TRAPDOOR, 2).pattern("PPP").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_TRAPDOOR)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_WOOD, 3).pattern("LL ").pattern("LL ").define('L', BiomeBlocks.MAPLE_LOG).unlockedBy(getHasName(BiomeBlocks.MAPLE_LOG), has(BiomeBlocks.MAPLE_LOG)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_WOOD)));
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_BOAT, 1).pattern("P P").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS),has(BiomeBlocks.MAPLE_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.MAPLE_BOAT)));
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_CHEST_BOAT, 1).pattern(" C ").pattern(" B ").define('B', BiomeItems.MAPLE_BOAT).define('C', Blocks.CHEST).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Blocks.CHEST), has(Blocks.CHEST)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.MAPLE_CHEST_BOAT)));
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_SIGN, 3).pattern("PPP").pattern("PPP").pattern(" S ").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS),has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.MAPLE_SIGN)));
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, BiomeItems.HANGING_MAPLE_SIGN, 6).pattern("C C").pattern("LLL").pattern("LLL").define('L', BiomeBlocks.STRIPPED_MAPLE_LOG).define('C', Blocks.CHAIN).unlockedBy(getHasName(BiomeBlocks.STRIPPED_MAPLE_LOG),has(BiomeBlocks.STRIPPED_MAPLE_LOG)).unlockedBy(getHasName(Blocks.CHAIN), has(Blocks.CHAIN)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.HANGING_MAPLE_SIGN)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_SYRUP_BOILER, 1).pattern("IGI").pattern("III").pattern("ILI").define('I', Items.IRON_INGOT).define('G', Items.GLASS).define('L', Items.LAVA_BUCKET).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).unlockedBy(getHasName(Items.GLASS), has(Items.GLASS)).unlockedBy(getHasName(Items.LAVA_BUCKET), has(Items.LAVA_BUCKET)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.MAPLE_SYRUP_BOILER)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BiomeItems.UNCURED_MAPLE_SYRUP, 4).pattern(" G ").pattern("GBG").pattern(" G ").define('G', Items.GLASS_BOTTLE).define('B', BiomeItems.TAPPED_MAPLE_SAP_BUCKET).unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE)).unlockedBy(getHasName(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), has(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.UNCURED_MAPLE_SYRUP)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BiomeBlocks.TAPPED_BUCKET, 1).requires(Items.BUCKET).requires(Items.IRON_INGOT).unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET)).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeBlocks.TAPPED_BUCKET)));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BiomeItems.PANCAKE ,3).pattern("WMW").pattern(" E ").pattern("WSW").define('W', Items.WHEAT).define('E', Items.EGG).define('S', Items.SUGAR).define('M', Items.MILK_BUCKET).unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT)).unlockedBy(getHasName(Items.EGG), has(Items.EGG)).unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR)).unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.PANCAKE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BiomeItems.PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.PANCAKE).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.PANCAKE_STACK)));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.MAPLE_PANCAKE).unlockedBy(getHasName(BiomeItems.MAPLE_PANCAKE), has(BiomeItems.MAPLE_PANCAKE)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.MAPLE_PANCAKE_STACK)));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.CHOCOLATE_PANCAKE).unlockedBy(getHasName(BiomeItems.CHOCOLATE_PANCAKE), has(BiomeItems.CHOCOLATE_PANCAKE)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.CHOCOLATE_PANCAKE_STACK)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE, 1).requires(BiomeItems.PANCAKE).requires(BiomeItems.MAPLE_SYRUP_BOTTLE).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).unlockedBy(getHasName(BiomeItems.MAPLE_SYRUP_BOTTLE), has(BiomeItems.MAPLE_SYRUP_BOTTLE)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.MAPLE_PANCAKE)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE, 1).requires(BiomeItems.PANCAKE).requires(Items.COCOA_BEANS).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BiomeItems.CHOCOLATE_PANCAKE)));
    }
}
