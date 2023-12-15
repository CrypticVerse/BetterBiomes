package net.crypticverse.betterbiomes.world.tree;

import net.crypticverse.betterbiomes.world.BetterBiomesConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class BetterBiomesSaplingGen {
    public static final SaplingGenerator MAPLE =
            new SaplingGenerator("maple", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BetterBiomesConfiguredFeatures.MAPLE_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

}