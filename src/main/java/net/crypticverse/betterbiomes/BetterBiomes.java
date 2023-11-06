package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.FuelingBlocks;
import net.crypticverse.betterbiomes.block.entity.BetterBiomesBlockEntities;
import net.crypticverse.betterbiomes.entity.BiomeBoats;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomesGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.recipe.BetterBiomesRecipes;
import net.crypticverse.betterbiomes.screen.BetterBiomesScreenHandlers;
import net.crypticverse.betterbiomes.world.gen.WorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBiomes implements ModInitializer {
	public static final String MOD_ID = "betterbiomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BetterBiomeFluids.register();
		BetterBiomesGroup.registerItemGroups();
		WorldGeneration.generateWorldGen();
		BiomeBlocks.registerModBlocks();
		BiomeItems.registerMapleItems();
		BetterBiomesBlockEntities.registerBlockEntities();
		BetterBiomesScreenHandlers.registerScreenHandlers();
		BetterBiomesRecipes.registerRecipes();
		BiomeBoats.registerBoats();
		FuelingBlocks.registerFuelingBlocks();
		FlammableBlocks.registerFlammableBlocks();
		StrippableBlockRegistry.register(BiomeBlocks.MAPLE_LOG, BiomeBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(BiomeBlocks.MAPLE_WOOD, BiomeBlocks.STRIPPED_MAPLE_WOOD);

		LOGGER.info("Better Biomes Loaded Successfully!");
	}
}