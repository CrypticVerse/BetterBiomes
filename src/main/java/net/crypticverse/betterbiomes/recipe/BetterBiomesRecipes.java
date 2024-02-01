package net.crypticverse.betterbiomes.recipe;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class BetterBiomesRecipes {
    public static void registerRecipes() {
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, new ResourceLocation(BetterBiomes.MOD_ID, MapleSyrupRecipe.Serializer.ID),
                MapleSyrupRecipe.Serializer.INSTANCE);
        Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(BetterBiomes.MOD_ID, MapleSyrupRecipe.Type.ID), MapleSyrupRecipe.Type.INSTANCE);
    }
}
