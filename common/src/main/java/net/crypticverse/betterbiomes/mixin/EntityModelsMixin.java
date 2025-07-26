package net.crypticverse.betterbiomes.mixin;

import com.google.common.collect.ImmutableMap;
import com.llamalad7.mixinextras.sugar.Local;
import net.crypticverse.betterbiomes.client.EntityLayerRenderer;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(LayerDefinitions.class)
public class EntityModelsMixin {
    @Inject(method = "createRoots", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/ImmutableMap$Builder;build()Lcom/google/common/collect/ImmutableMap;", remap = false))
    private static void registerBBModels(CallbackInfoReturnable<Map<ModelLayerLocation, LayerDefinition>> info, @Local ImmutableMap.Builder<ModelLayerLocation, LayerDefinition> builder) {
        for (Map.Entry<ModelLayerLocation, EntityLayerRenderer.TexturedModelProvider> entry : EntityLayerRenderer.MODEL_PROVIDER.entrySet()) {
            builder.put(entry.getKey(), entry.getValue().createData());
        }
    }
}
