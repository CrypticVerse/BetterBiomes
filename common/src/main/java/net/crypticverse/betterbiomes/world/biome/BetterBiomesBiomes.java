package net.crypticverse.betterbiomes.world.biome;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.world.feature.BetterBiomesPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.attribute.AmbientSounds;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.jetbrains.annotations.Nullable;


public class BetterBiomesBiomes {
    public static final ResourceKey<Biome> MAPLE_FOREST = createKey("maple_forest");

    public static void bootstrap(BootstrapContext<Biome> context) {
        context.register(MAPLE_FOREST, mapleForest(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome mapleForest(BootstrapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, 4, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 4, 4));

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BetterBiomesPlacedFeatures.MAPLE_PLACED_KEY);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder, true);

        return buildBiome(biomeBuilder.build(), spawnBuilder.build(), true, 0.7f, 0.4f, 0x79c05a);
    }

    private static Biome buildBiome(
            BiomeGenerationSettings generationSettings, MobSpawnSettings mobSpawnSettings,
            boolean precipitation, float temp, float downfall, @Nullable Integer grassColor
    ) {
        BiomeSpecialEffects.Builder specialEffects = new BiomeSpecialEffects.Builder()
                .waterColor(4159204);
        if (grassColor != null) {
            specialEffects.grassColorOverride(grassColor);
        }

        return new Biome.BiomeBuilder()
                .hasPrecipitation(precipitation).temperature(temp)
                .setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 329011)
                .setAttribute(EnvironmentAttributes.FOG_COLOR, 12638463)
                .setAttribute(EnvironmentAttributes.SKY_COLOR, skyColorCalc(temp))
                .setAttribute(EnvironmentAttributes.AMBIENT_SOUNDS, AmbientSounds.LEGACY_CAVE_SETTINGS)
                .downfall(downfall).specialEffects(specialEffects.build())
                .mobSpawnSettings(mobSpawnSettings).generationSettings(generationSettings)
                .build();
    }

    private static int skyColorCalc(float temp) {
        float f = temp / 3.0F;
        f = Mth.clamp(f, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }

    private static ResourceKey<Biome> createKey(String key) {
        return ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, key));
    }
}