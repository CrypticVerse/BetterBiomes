package net.crypticverse.betterbiomes.client;

import com.google.common.collect.Sets;
import net.crypticverse.betterbiomes.entity.BBEntityTypes;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class EntityLayerRenderer {
    public static final Map<ModelLayerLocation, TexturedModelProvider> MODEL_PROVIDER = new HashMap<>();
    public static void register() {
        LayerDefinition boatModelData = BoatModel.createBoatModel();
        LayerDefinition chestBoatModelData = BoatModel.createChestBoatModel();
        registerLayers(ModModelLayers.MAPLE_BOAT, () -> boatModelData, BBEntityTypes.MAPLE_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_BOAT));
        registerLayers(ModModelLayers.MAPLE_CHEST_BOAT, () -> chestBoatModelData, BBEntityTypes.MAPLE_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_CHEST_BOAT));
    }

    public static <E extends Entity> void registerLayers(ModelLayerLocation layer, TexturedModelProvider modelProvider, EntityType<? extends E> entityType, EntityRendererProvider<E> entityRendererFactory) {
        if (MODEL_PROVIDER.putIfAbsent(layer, modelProvider) != null) {
            throw new IllegalArgumentException("Cannot replace entity model layer" + layer);
        }
        ModelLayers.ALL_MODELS = Sets.newHashSet(ModelLayers.ALL_MODELS);
        ModelLayers.ALL_MODELS.add(layer);
        EntityRenderers.register(entityType, entityRendererFactory);
    }

    @FunctionalInterface
    public interface TexturedModelProvider {
        LayerDefinition createData();
    }
}
