package net.crypticverse.betterbiomes.client;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation MAPLE_BOAT = register("boat/maple");
    public static final ModelLayerLocation MAPLE_CHEST_BOAT = register("chest_boat/maple");

    private static ModelLayerLocation register(String name) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name), "main");
    }
}
