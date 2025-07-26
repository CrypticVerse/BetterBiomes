package net.crypticverse.betterbiomes.neoforge;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.BetterBiomesClient;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.block.FlammableBlocks;
import net.crypticverse.betterbiomes.block.StrippableBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomesItemGroup;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.crypticverse.betterbiomes.world.biome.BiomeTerraBlenderAPI;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(BetterBiomes.MOD_ID)
public class BetterBiomesNeoForge {

    public BetterBiomesNeoForge(IEventBus eventBus) {
        eventBus.addListener(this::registry);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);
    }

    @SubscribeEvent
    private void registry(RegisterEvent event) {
        event.register(Registries.ITEM, handler -> BiomeBlocks.registerModBlocks());
        event.register(Registries.CREATIVE_MODE_TAB, handler -> BetterBiomesItemGroup.registerItemGroups());
        event.register(Registries.BLOCK, handler -> BiomeItems.registerItems());
        event.register(Registries.FLUID, handler -> BetterBiomeFluids.register());
    }

    @SubscribeEvent
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(BiomeTerraBlenderAPI::initTerrablender);
    }

    @SubscribeEvent
    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(BetterBiomesClient::initClient);
    }
}