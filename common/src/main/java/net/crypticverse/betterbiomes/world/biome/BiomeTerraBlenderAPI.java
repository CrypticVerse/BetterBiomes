package net.crypticverse.betterbiomes.world.biome;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.world.biome.surface.BetterBiomesMaterialRules;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class BiomeTerraBlenderAPI {
    public static void initTerrablender() {
        Regions.register(new BetterBiomesOverworldRegion(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD , BetterBiomes.MOD_ID, BetterBiomesMaterialRules.makeRules());
    }
}
