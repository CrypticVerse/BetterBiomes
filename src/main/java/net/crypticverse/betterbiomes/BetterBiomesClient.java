package net.crypticverse.betterbiomes;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class BetterBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(BiomeBlocks.MAPLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BiomeBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BiomeBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BiomeBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BiomeBlocks.TAPPED_BUCKET, BlockRenderLayer.CUTOUT);
        TerraformBoatClientHelper.registerModelLayers(BiomeItems.MAPLE_BOAT_ID);
        FluidRenderHandlerRegistry.INSTANCE.register(BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP, SimpleFluidRenderHandler.coloredWater(-1583985920));
        BlockRenderLayerMap.putFluids(BlockRenderLayer.TRANSLUCENT, BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP);
    }
}
