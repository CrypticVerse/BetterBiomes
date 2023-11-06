package net.crypticverse.betterbiomes.block;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class FuelingBlocks {
    public static void registerFuelingBlocks() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(BiomeBlocks.MAPLE_LOG, 300);
        registry.add(BiomeBlocks.MAPLE_WOOD, 300);
        registry.add(BiomeBlocks.STRIPPED_MAPLE_LOG, 300);
        registry.add(BiomeBlocks.STRIPPED_MAPLE_WOOD, 300);
        registry.add(BiomeBlocks.MAPLE_PLANKS, 300);
        registry.add(BiomeBlocks.MAPLE_PRESSURE_PLATE, 300);
        registry.add(BiomeBlocks.MAPLE_FENCE,  300);
        registry.add(BiomeBlocks.MAPLE_FENCE_GATE, 300);
        registry.add(BiomeBlocks.MAPLE_STAIRS, 300);
        registry.add(BiomeBlocks.MAPLE_TRAPDOOR, 300);
        registry.add(BiomeBlocks.MAPLE_DOOR, 300);
        registry.add(BiomeBlocks.MAPLE_SLAB, 150);
        registry.add(BiomeBlocks.MAPLE_BUTTON, 100);
        registry.add(BiomeBlocks.STANDING_MAPLE_SIGN, 200);
        registry.add(BiomeBlocks.HANGING_MAPLE_SIGN, 200);
    }
}
