package net.crypticverse.betterbiomes.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import net.crypticverse.betterbiomes.world.BetterBiomesPlacedFeatures;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;

public class TreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BetterBiomesBiomes.MAPLE_FOREST, Biomes.FOREST, Biomes.FLOWER_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BetterBiomesPlacedFeatures.MAPLE_PLACED_KEY);
    }
}
