package me.crypticverse.betterbiomes.world.tree;

import me.crypticverse.betterbiomes.world.BetterBiomesConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PalmTreeSaplingGen extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return BetterBiomesConfiguredFeatures.PALM_KEY;
    }
}
