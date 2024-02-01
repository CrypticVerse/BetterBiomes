package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.data.*;
import net.crypticverse.betterbiomes.world.BetterBiomesConfiguredFeatures;
import net.crypticverse.betterbiomes.world.BetterBiomesPlacedFeatures;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class BetterBiomesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockTagGen::new);
		pack.addProvider(ItemTagGen::new);
		pack.addProvider(FluidTagGen::new);
		pack.addProvider(RecipeGen::new);
		pack.addProvider(LootTableGen::new);
		pack.addProvider(ModelGen::new);
		pack.addProvider(WorldGen::new);

	}
	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, BetterBiomesConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, BetterBiomesPlacedFeatures::bootstrap);
		registryBuilder.add(Registries.BIOME, BetterBiomesBiomes::boostrap);
	}
}
