package net.crypticverse.betterbiomes.registry;

import net.crypticverse.betterbiomes.block.StrippableBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.FuelingBlocks;
import net.crypticverse.betterbiomes.world.gen.WorldGeneration;

public class LevelRegistryLoader {

    public static void loadRegistries() {
        BetterBiomes.LOGGER.info("Starting load process for level registries");
        WorldGeneration.generateWorldGen();
        FuelingBlocks.registerFuelingBlocks();
        FlammableBlocks.registerFlammableBlocks();
        StrippableBlocks.registerStrippableBlocks();
        BetterBiomes.LOGGER.info("All level registries have loaded for Better Biomes");
    }

}
