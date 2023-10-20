package me.crypticverse.betterbiomes;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import me.crypticverse.betterbiomes.screen.BetterBiomesScreenHandlers;
import me.crypticverse.betterbiomes.screen.MapleSyrupScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class BetterBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_SAPLING, RenderLayer.getCutout());


        FluidRenderHandlerRegistry.INSTANCE.register(BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1964B00
                ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP);

        HandledScreens.register(BetterBiomesScreenHandlers.MAPLE_SYRUP_SCREEN_HANDLER, MapleSyrupScreen::new);

    }
}
