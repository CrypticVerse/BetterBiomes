package net.crypticverse.betterbiomes.neoforge;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.BetterBiomesClient;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomesItemGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.world.biome.BiomeTerraBlenderAPI;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(BetterBiomes.MOD_ID)
public class BetterBiomesNeoForge {

    public BetterBiomesNeoForge(IEventBus eventBus) {
        eventBus.addListener(this::registry);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        eventBus.addListener((EntityRenderersEvent.RegisterRenderers event) -> BetterBiomesClient.registerEntityRenderers(event::registerEntityRenderer));
        eventBus.addListener((EntityRenderersEvent.RegisterLayerDefinitions event) -> BetterBiomesClient.registerLayerDefinitions(event::registerLayerDefinition));

    }

    private void registry(RegisterEvent event) {
        event.register(Registries.BLOCK, handler -> BiomeBlocks.registerModBlocks());
        event.register(Registries.CREATIVE_MODE_TAB, handler -> BetterBiomesItemGroup.registerItemGroups());
        event.register(Registries.ITEM, handler -> BiomeItems.registerItems());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(BiomeTerraBlenderAPI::initTerrablender);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(BetterBiomesClient::registerBlockLayers);
    }
}