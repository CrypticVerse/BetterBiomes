package net.crypticverse.betterbiomes;

import net.crypticverse.betterbiomes.client.BlockLayerRenderer;
import net.crypticverse.betterbiomes.client.ModModelLayers;
import net.crypticverse.betterbiomes.entity.BBEntityTypes;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class BetterBiomesClient {
    public static void registerBlockLayers() {
        BlockLayerRenderer.renderLayerClient();
    }

    public static void registerLayerDefinitions(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> consumer) {
        LayerDefinition boatLayer = BoatModel.createBoatModel();
        LayerDefinition chestBoatLayer = BoatModel.createChestBoatModel();

        consumer.accept(ModModelLayers.MAPLE_BOAT, () -> boatLayer);
        consumer.accept(ModModelLayers.MAPLE_CHEST_BOAT, () -> chestBoatLayer);
    }

    public static void registerEntityRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> consumer) {
        consumer.accept(BBEntityTypes.MAPLE_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_BOAT));
        consumer.accept(BBEntityTypes.MAPLE_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_CHEST_BOAT));
    }
}
