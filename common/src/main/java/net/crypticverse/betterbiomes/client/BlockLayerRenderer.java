package net.crypticverse.betterbiomes.client;

import com.google.common.collect.Maps;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.level.block.Block;

public class BlockLayerRenderer {
    public static void renderLayerClient() {
        registerRenderLayer(BiomeBlocks.MAPLE_LEAVES, ChunkSectionLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.MAPLE_DOOR, ChunkSectionLayer.CUTOUT);
        registerRenderLayer(BiomeBlocks.TAPPED_BUCKET, ChunkSectionLayer.CUTOUT);
    }

    public static void registerRenderLayer(Block block, ChunkSectionLayer type) {
        ItemBlockRenderTypes.TYPE_BY_BLOCK = Maps.newHashMap(ItemBlockRenderTypes.TYPE_BY_BLOCK);
        ItemBlockRenderTypes.TYPE_BY_BLOCK.put(block, type);
    }
}
