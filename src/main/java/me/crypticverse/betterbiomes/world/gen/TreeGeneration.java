package me.crypticverse.betterbiomes.world.gen;

import me.crypticverse.betterbiomes.world.BetterBiomesPlacedFeatures;
import me.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class TreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BetterBiomesBiomes.MAPLE_FOREST, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, BetterBiomesPlacedFeatures.MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, BetterBiomesPlacedFeatures.PALM_PLACED_KEY);
    }
}
