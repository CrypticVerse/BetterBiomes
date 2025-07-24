package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.StrippableBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomesItemGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBiomes implements ModInitializer {
	public static final String MOD_ID = "betterbiomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BetterBiomeFluids.register();
		BetterBiomesItemGroup.registerItemGroups();
		BiomeBlocks.registerModBlocks();
		BiomeItems.registerMapleItems();
		FlammableBlocks.registerFlammableBlocks();
		StrippableBlocks.addStrippableBlocks();

		LOGGER.info("Better Biomes Loaded Successfully!");
	}
}