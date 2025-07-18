package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup lookup, RecipeExporter exporter) {
        return new RecipeGenerator(lookup, exporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.MISC, BiomeBlocks.MAPLE_BUTTON, 1).input(BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_BUTTON)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_SLAB, 6).pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_PRESSURE_PLATE, 1).pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE, 3).pattern("PSP").pattern("PSP").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_FENCE_GATE, 1).pattern("SPS").pattern("SPS").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_TRAPDOOR, 2).pattern("PPP").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeBlocks.MAPLE_WOOD, 3).pattern("LL ").pattern("LL ").input('L', BiomeBlocks.MAPLE_LOG).criterion(hasItem(BiomeBlocks.MAPLE_LOG), conditionsFromItem(BiomeBlocks.MAPLE_LOG)).offerTo(exporter);
                createShaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_BOAT, 1).pattern("P P").pattern("PPP").input('P', BiomeBlocks.MAPLE_PLANKS).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS),conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).offerTo(exporter);
                createShaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_CHEST_BOAT, 1).pattern(" C ").pattern(" B ").input('B', BiomeItems.MAPLE_BOAT).input('C', Blocks.CHEST).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS), conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST)).offerTo(exporter);
                createShaped(RecipeCategory.TRANSPORTATION, BiomeItems.MAPLE_SIGN, 3).pattern("PPP").pattern("PPP").pattern(" S ").input('P', BiomeBlocks.MAPLE_PLANKS).input('S', Items.STICK).criterion(hasItem(BiomeBlocks.MAPLE_PLANKS),conditionsFromItem(BiomeBlocks.MAPLE_PLANKS)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter);
                createShaped(RecipeCategory.TRANSPORTATION, BiomeItems.HANGING_MAPLE_SIGN, 6).pattern("C C").pattern("LLL").pattern("LLL").input('L', BiomeBlocks.STRIPPED_MAPLE_LOG).input('C', Blocks.CHAIN).criterion(hasItem(BiomeBlocks.STRIPPED_MAPLE_LOG),conditionsFromItem(BiomeBlocks.STRIPPED_MAPLE_LOG)).criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN)).offerTo(exporter);
                createShaped(RecipeCategory.MISC, BiomeItems.UNCURED_MAPLE_SYRUP, 4).pattern(" G ").pattern("GBG").pattern(" G ").input('G', Items.GLASS_BOTTLE).input('B', BiomeItems.TAPPED_MAPLE_SAP_BUCKET).criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE)).criterion(hasItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), conditionsFromItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, BiomeBlocks.TAPPED_BUCKET, 1).input(Items.BUCKET).input(Items.IRON_INGOT).criterion(hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
                createShaped(RecipeCategory.FOOD, BiomeItems.PANCAKE ,3).pattern("WMW").pattern(" E ").pattern("WSW").input('W', Items.WHEAT).input('E', Items.EGG).input('S', Items.SUGAR).input('M', Items.MILK_BUCKET).criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT)).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG)).criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR)).criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);
                createShaped(RecipeCategory.FOOD, BiomeItems.PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.PANCAKE).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).offerTo(exporter);
                createShaped(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.MAPLE_PANCAKE).criterion(hasItem(BiomeItems.MAPLE_PANCAKE), conditionsFromItem(BiomeItems.MAPLE_PANCAKE)).offerTo(exporter);
                createShaped(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE_STACK, 1).pattern("PPP").pattern("PPP").pattern("PPP").input('P', BiomeItems.CHOCOLATE_PANCAKE).criterion(hasItem(BiomeItems.CHOCOLATE_PANCAKE), conditionsFromItem(BiomeItems.CHOCOLATE_PANCAKE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, BiomeItems.MAPLE_PANCAKE, 1).input(BiomeItems.PANCAKE).input(BiomeItems.TAPPED_MAPLE_SAP_BUCKET).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).criterion(hasItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET), conditionsFromItem(BiomeItems.TAPPED_MAPLE_SAP_BUCKET)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, BiomeItems.CHOCOLATE_PANCAKE, 1).input(BiomeItems.PANCAKE).input(Items.COCOA_BEANS).criterion(hasItem(BiomeItems.PANCAKE), conditionsFromItem(BiomeItems.PANCAKE)).criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS)).offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Better Biomes";
    }
}
