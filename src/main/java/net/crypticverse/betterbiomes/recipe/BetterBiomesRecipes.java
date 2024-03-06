package net.crypticverse.betterbiomes.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import net.crypticverse.betterbiomes.BetterBiomes;

public class BetterBiomesRecipes {
    public static void registerRecipes() {
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, new ResourceLocation(BetterBiomes.MOD_ID, MapleSyrupRecipe.Serializer.ID),
                MapleSyrupRecipe.Serializer.INSTANCE);
        Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(BetterBiomes.MOD_ID, MapleSyrupRecipe.Type.ID), MapleSyrupRecipe.Type.INSTANCE);
    }
}
