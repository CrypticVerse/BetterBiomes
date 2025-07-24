package net.crypticverse.betterbiomes.client;

import com.google.common.collect.Maps;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayers;

public class BlockLayerRenderer {
    public static void renderLayerClient() {
        registerRenderLayer(BiomeBlocks.MAPLE_LEAVES, BlockRenderLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.TAPPED_BUCKET, BlockRenderLayer.CUTOUT);
    }

    public static void registerRenderLayer(Block block, BlockRenderLayer type) {
        RenderLayers.BLOCKS = Maps.newHashMap(RenderLayers.BLOCKS);
        RenderLayers.BLOCKS.put(block, type);
    }
}
