package net.crypticverse.betterbiomes.registry;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.entity.BetterBiomesBlockEntities;
import net.crypticverse.betterbiomes.entity.BiomeBoats;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomesGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.recipe.BetterBiomesRecipes;
import net.crypticverse.betterbiomes.screen.BetterBiomesScreenHandlers;

public class CoreRegistryLoader {

    public static void loadRegistries() {
        BetterBiomes.LOGGER.info("Starting load process for core registries");
        BiomeBlocks.registerModBlocks();
        BiomeItems.registerMapleItems();
        BetterBiomeFluids.register();
        BetterBiomesGroup.registerItemGroups();
        BetterBiomesBlockEntities.registerBlockEntities();
        BetterBiomesScreenHandlers.registerScreenHandlers();
        BiomeBoats.registerBoats();
        BetterBiomesRecipes.registerRecipes();
        BetterBiomes.LOGGER.info("All core registries have loaded for Better Biomes");
    }
}
