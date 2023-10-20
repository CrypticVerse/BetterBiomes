package me.crypticverse.betterbiomes.recipe;

import me.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterBiomesRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(BetterBiomes.MOD_ID, MapleSyrupRecipe.Serializer.ID),
                MapleSyrupRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(BetterBiomes.MOD_ID, MapleSyrupRecipe.Type.ID), MapleSyrupRecipe.Type.INSTANCE);
    }
}
