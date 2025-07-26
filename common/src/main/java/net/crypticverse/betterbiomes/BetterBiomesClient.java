package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.client.BlockLayerRenderer;
import net.crypticverse.betterbiomes.client.EntityLayerRenderer;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class BetterBiomesClient {
    public static void initClient() {
        BlockLayerRenderer.renderLayerClient();
        EntityLayerRenderer.register();
        //FluidRenderHandlerRegistry.INSTANCE.register(BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP, SimpleFluidRenderHandler.coloredWater(-1583985920));
        //BlockRenderLayerMap.putFluids(ChunkSectionLayer.TRANSLUCENT, BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP);
    }
}
