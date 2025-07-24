package net.crypticverse.betterbiomes.client;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MAPLE_BOAT = register("boat/maple");
    public static final EntityModelLayer MAPLE_CHEST_BOAT = register("chest_boat/maple");

    private static EntityModelLayer register(String name) {
        return new EntityModelLayer(Identifier.of(BetterBiomes.MOD_ID, name), "main");
    }
}
