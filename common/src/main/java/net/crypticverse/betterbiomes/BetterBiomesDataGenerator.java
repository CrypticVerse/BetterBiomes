package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.world.feature.BetterBiomesConfiguredFeatures;
import net.crypticverse.betterbiomes.world.feature.BetterBiomesPlacedFeatures;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class BetterBiomesDataGenerator   {
	public void dataGen() {
		//FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		//pack.addProvider(BlockTagGen::new);
		//pack.addProvider(ItemTagGen::new);
		//pack.addProvider(FluidTagGen::new);
		//pack.addProvider(RecipeGen::new);
		//pack.addProvider(LootTableGen::new);
		//pack.addProvider(ModelGen::new);
		//pack.addProvider(WorldGen::new);

	}
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, BetterBiomesConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, BetterBiomesPlacedFeatures::bootstrap);
		registryBuilder.add(Registries.BIOME, BetterBiomesBiomes::bootstrap);
	}
}
