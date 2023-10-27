package me.crypticverse.betterbiomes;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.block.FlammableBlocks;
import me.crypticverse.betterbiomes.block.entity.BetterBiomesBlockEntities;
import me.crypticverse.betterbiomes.entity.BiomeBoats;
import me.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import me.crypticverse.betterbiomes.item.BetterBiomesGroup;
import me.crypticverse.betterbiomes.item.BiomeItems;
import me.crypticverse.betterbiomes.recipe.BetterBiomesRecipes;
import me.crypticverse.betterbiomes.screen.BetterBiomesScreenHandlers;
import me.crypticverse.betterbiomes.world.gen.WorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBiomes implements ModInitializer {
	public static final String MOD_ID = "betterbiomes";
    public static final Logger LOGGER = LoggerFactory.getLogger("betterbiomes");

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

		FlammableBlocks.registerFlammableBlocks();
		StrippableBlockRegistry.register(BiomeBlocks.MAPLE_LOG, BiomeBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(BiomeBlocks.MAPLE_WOOD, BiomeBlocks.STRIPPED_MAPLE_WOOD);

		LOGGER.info("Better Biomes Loaded Sucessfully!");
	}
}