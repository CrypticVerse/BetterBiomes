package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.client.BlockLayerRenderer;
import net.crypticverse.betterbiomes.client.EntityLayerRenderer;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class BetterBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockLayerRenderer.renderLayerClient();
        EntityLayerRenderer.register();
        FluidRenderHandlerRegistry.INSTANCE.register(BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP, SimpleFluidRenderHandler.coloredWater(-1583985920));
        BlockRenderLayerMap.putFluids(BlockRenderLayer.TRANSLUCENT, BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP);
    }
}
