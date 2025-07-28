package net.crypticverse.betterbiomes.neoforge;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.neoforge.data.*;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.crypticverse.betterbiomes.world.feature.BetterBiomesConfiguredFeatures;
import net.crypticverse.betterbiomes.world.feature.BetterBiomesPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = BetterBiomes.MOD_ID)
public class DataGenerationProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, BetterBiomesConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, BetterBiomesPlacedFeatures::bootstrap)
            .add(Registries.BIOME, BetterBiomesBiomes::bootstrap);

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new DatapackBuiltinEntriesProvider(output, lookupProvider, BUILDER, Set.of(BetterBiomes.MOD_ID)));

        generator.addProvider(true, new RecipeGen.Runner(output, lookupProvider));

        generator.addProvider(true, LootTableGen.create(output, lookupProvider));

        generator.addProvider(true, new BlockTagGen(output, lookupProvider));
        generator.addProvider(true, new ItemTagGen(output, lookupProvider));
        generator.addProvider(true, new ModelGen(output));
    }
}
