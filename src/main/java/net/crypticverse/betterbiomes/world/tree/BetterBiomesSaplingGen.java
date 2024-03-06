package net.crypticverse.betterbiomes.world.tree;

import java.util.Optional;

import net.minecraft.world.level.block.grower.TreeGrower;

import net.crypticverse.betterbiomes.world.BetterBiomesConfiguredFeatures;

public class BetterBiomesSaplingGen {
    public static final TreeGrower MAPLE =
            new TreeGrower("maple", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BetterBiomesConfiguredFeatures.MAPLE_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

}