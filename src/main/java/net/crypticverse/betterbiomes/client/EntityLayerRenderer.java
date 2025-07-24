package net.crypticverse.betterbiomes.client;

import com.google.common.collect.Sets;
import net.crypticverse.betterbiomes.entity.BBEntityTypes;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.EntityRenderers;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class EntityLayerRenderer {
    public static final Map<EntityModelLayer, TexturedModelProvider> MODEL_PROVIDER = new HashMap<>();
    public static void register() {
        TexturedModelData boatModelData = BoatEntityModel.getTexturedModelData();
        TexturedModelData chestBoatModelData = BoatEntityModel.getChestTexturedModelData();
        registerLayers(ModModelLayers.MAPLE_BOAT, () -> boatModelData, BBEntityTypes.MAPLE_BOAT, context -> new BoatEntityRenderer(context, ModModelLayers.MAPLE_BOAT));
        registerLayers(ModModelLayers.MAPLE_CHEST_BOAT, () -> chestBoatModelData, BBEntityTypes.MAPLE_CHEST_BOAT, context -> new BoatEntityRenderer(context, ModModelLayers.MAPLE_CHEST_BOAT));
    }

    public static <E extends Entity> void registerLayers(EntityModelLayer layer, TexturedModelProvider modelProvider, EntityType<? extends E> entityType, EntityRendererFactory<E> entityRendererFactory) {
        if (MODEL_PROVIDER.putIfAbsent(layer, modelProvider) != null) {
            throw new IllegalArgumentException("Cannot replace entity model layer" + layer);
        }
        EntityModelLayers.LAYERS = Sets.newHashSet(EntityModelLayers.LAYERS);
        EntityModelLayers.LAYERS.add(layer);
        EntityRenderers.register(entityType, entityRendererFactory);
    }

    @FunctionalInterface
    public interface TexturedModelProvider {
        TexturedModelData createData();
    }
}
