package net.crypticverse.betterbiomes.registry;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.FuelingBlocks;
import net.crypticverse.betterbiomes.world.gen.WorldGeneration;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class LevelRegistryLoader implements RegistryProvider {

    public static void loadRegistries() {
        BetterBiomes.LOGGER.info("Starting load process for level registries");
        WorldGeneration.generateWorldGen();
        FuelingBlocks.registerFuelingBlocks();
        FlammableBlocks.registerFlammableBlocks();
        StrippableBlockRegistry.register(BiomeBlocks.MAPLE_LOG, BiomeBlocks.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.MAPLE_WOOD, BiomeBlocks.STRIPPED_MAPLE_WOOD);
        BetterBiomes.LOGGER.info("All level registries have loaded for Better Biomes");
    }

}
