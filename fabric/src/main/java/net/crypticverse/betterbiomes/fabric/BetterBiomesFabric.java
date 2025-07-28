package net.crypticverse.betterbiomes.fabric;

import net.crypticverse.betterbiomes.BetterBiomesClient;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.StrippableBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomesItemGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.world.biome.BiomeTerraBlenderAPI;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import terrablender.api.TerraBlenderApi;

public class BetterBiomesFabric implements ClientModInitializer, ModInitializer, TerraBlenderApi {
    
    @Override
    public void onInitialize() {
        BetterBiomesItemGroup.registerItemGroups();
        BiomeBlocks.registerModBlocks();
        BiomeItems.registerItems();
        FlammableBlocks.registerFlammableBlocks();
        StrippableBlocks.addStrippableBlocks();
    }

    @Override
    public void onInitializeClient() {
        BetterBiomesClient.registerBlockLayers();
        BetterBiomesClient.registerEntityRenderers(EntityRendererRegistry::register);
        BetterBiomesClient.registerLayerDefinitions((a, b) -> EntityModelLayerRegistry.registerModelLayer(a, b::get));
    }

    @Override
    public void onTerraBlenderInitialized() {
        BiomeTerraBlenderAPI.initTerrablender();
    }
}
