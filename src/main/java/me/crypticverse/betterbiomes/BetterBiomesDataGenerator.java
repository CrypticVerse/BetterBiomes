package me.crypticverse.betterbiomes;

import me.crypticverse.betterbiomes.data.*;
import me.crypticverse.betterbiomes.world.BetterBiomesConfiguredFeatures;
import me.crypticverse.betterbiomes.world.BetterBiomesPlacedFeatures;
import me.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BetterBiomesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockTagGen::new);
		pack.addProvider(ItemTagGen::new);
		pack.addProvider(RecipeGen::new);
		pack.addProvider(LootTableGen::new);
		pack.addProvider(ModelGen::new);
		pack.addProvider(WorldGen::new);

	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BetterBiomesConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BetterBiomesPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, BetterBiomesBiomes::bootstrap);
	}
}
