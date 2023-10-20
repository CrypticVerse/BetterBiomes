package me.crypticverse.betterbiomes.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(BiomeBlocks.MAPLE_LOG, 5, 5);
        registry.add(BiomeBlocks.MAPLE_WOOD, 5, 5);
        registry.add(BiomeBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(BiomeBlocks.STRIPPED_MAPLE_WOOD, 5, 5);

        registry.add(BiomeBlocks.MAPLE_LEAVES, 30, 60);
        registry.add(BiomeBlocks.MAPLE_PLANKS, 5, 20);


    }
}
