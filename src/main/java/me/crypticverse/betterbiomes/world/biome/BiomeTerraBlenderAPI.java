package me.crypticverse.betterbiomes.world.biome;

import me.crypticverse.betterbiomes.BetterBiomes;
import me.crypticverse.betterbiomes.world.biome.surface.BetterBiomesMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class BiomeTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new BetterBiomesOverworldRegion(new Identifier(BetterBiomes.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD , BetterBiomes.MOD_ID, BetterBiomesMaterialRules.makeRules());
    }
}
