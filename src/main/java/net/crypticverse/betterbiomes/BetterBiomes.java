package net.crypticverse.betterbiomes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

import net.minecraft.resources.ResourceLocation;

import net.crypticverse.betterbiomes.registry.CoreRegistryLoader;
import net.crypticverse.betterbiomes.registry.LevelRegistryLoader;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesOverworldRegion;
import net.crypticverse.betterbiomes.world.biome.surface.BetterBiomesMaterialRules;

public class BetterBiomes implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "betterbiomes";
	public static final String REGISTRY_ID = "Better Biomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(REGISTRY_ID);

	@Override
	public void onInitialize() {
		CoreRegistryLoader.loadRegistries();
		LevelRegistryLoader.loadRegistries();
		LOGGER.info("Better Biomes Loaded Successfully!");
	}
	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new BetterBiomesOverworldRegion(new ResourceLocation(MOD_ID, "overworld"), 4));
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, BetterBiomesMaterialRules.makeRules());
	}
}