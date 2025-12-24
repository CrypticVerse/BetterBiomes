package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class RecipeGen extends RecipeProvider {
    public RecipeGen(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
        shapeless(RecipeCategory.MISC, BiomeBlocks.MAPLE_BUTTON, 1).requires(BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_BUTTON)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_SLAB, 6).pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_PRESSURE_PLATE, 1).pattern(" PP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE, 3).pattern("PSP").pattern("PSP").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE_GATE, 1).pattern("SPS").pattern("SPS").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_TRAPDOOR, 2).pattern("PPP").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_WOOD, 3).pattern("LL ").pattern("LL ").define('L', BiomeBlocks.MAPLE_LOG).unlockedBy(getHasName(BiomeBlocks.MAPLE_LOG), has(BiomeBlocks.MAPLE_LOG)).save(output);
        shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_BOAT, 1).pattern("P P").pattern("PPP").define('P', BiomeBlocks.MAPLE_PLANKS).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS),has(BiomeBlocks.MAPLE_PLANKS)).save(output);
        shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_CHEST_BOAT, 1).pattern(" C ").pattern(" B ").define('B', BiomeItems.MAPLE_BOAT).define('C', Blocks.CHEST).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS), has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Blocks.CHEST), has(Blocks.CHEST)).save(output);
        shaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_SIGN, 3).pattern("PPP").pattern("PPP").pattern(" S ").define('P', BiomeBlocks.MAPLE_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BiomeBlocks.MAPLE_PLANKS),has(BiomeBlocks.MAPLE_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(output);
        shaped(RecipeCategory.TRANSPORTATION, BiomeItems.HANGING_MAPLE_SIGN, 6).pattern("C C").pattern("LLL").pattern("LLL").define('L', BiomeBlocks.STRIPPED_MAPLE_LOG).define('C', Blocks.IRON_CHAIN).unlockedBy(getHasName(BiomeBlocks.STRIPPED_MAPLE_LOG),has(BiomeBlocks.STRIPPED_MAPLE_LOG)).unlockedBy(getHasName(Blocks.IRON_CHAIN), has(Blocks.IRON_CHAIN)).save(output);
        shaped(RecipeCategory.MISC, BiomeItems.UNCURED_MAPLE_SYRUP, 4).pattern(" G ").pattern("GBG").pattern(" G ").define('G', Items.GLASS_BOTTLE).define('B', BiomeItems.TAPPED_MAPLE_SAP_BUCKET).unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE)).unlockedBy(getHasName(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), has(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).save(output);
        shapeless(RecipeCategory.MISC, BiomeBlocks.TAPPED_BUCKET, 1).requires(Items.BUCKET).requires(Items.IRON_INGOT).unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET)).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(output);
        shaped(RecipeCategory.FOOD, BiomeItems.PANCAKE ,3).pattern("WMW").pattern(" E ").pattern("WSW").define('W', Items.WHEAT).define('E', Items.EGG).define('S', Items.SUGAR).define('M', Items.MILK_BUCKET).unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT)).unlockedBy(getHasName(Items.EGG), has(Items.EGG)).unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR)).unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET)).save(output);
        shaped(RecipeCategory.FOOD, BiomeItems.PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.PANCAKE).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).save(output);
        shaped(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.MAPLE_PANCAKE).unlockedBy(getHasName(BiomeItems.MAPLE_PANCAKE), has(BiomeItems.MAPLE_PANCAKE)).save(output);
        shaped(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BiomeItems.CHOCOLATE_PANCAKE).unlockedBy(getHasName(BiomeItems.CHOCOLATE_PANCAKE), has(BiomeItems.CHOCOLATE_PANCAKE)).save(output);
        shapeless(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE, 1).requires(BiomeItems.PANCAKE).requires(BiomeItems.TAPPED_MAPLE_SAP_BUCKET).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).unlockedBy(getHasName(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), has(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).save(output);
        shapeless(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE, 1).requires(BiomeItems.PANCAKE).requires(Items.COCOA_BEANS).unlockedBy(getHasName(BiomeItems.PANCAKE), has(BiomeItems.PANCAKE)).unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS)).save(output);
        shapeless(RecipeCategory.BUILDING_BLOCKS, BiomeBlocks.MAPLE_PLANKS, 4).requires(BiomeBlocks.MAPLE_LOG).unlockedBy(getHasName(BiomeBlocks.MAPLE_LOG), has(BiomeBlocks.MAPLE_LOG)).save(output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
            super(output, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new RecipeGen(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Better Biomes Recipes";
        }
    }
}
