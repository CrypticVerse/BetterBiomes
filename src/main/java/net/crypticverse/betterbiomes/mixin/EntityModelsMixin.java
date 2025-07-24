package net.crypticverse.betterbiomes.mixin;

import com.google.common.collect.ImmutableMap;
import com.llamalad7.mixinextras.sugar.Local;
import net.crypticverse.betterbiomes.client.EntityLayerRenderer;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(EntityModels.class)
public class EntityModelsMixin {
    @Inject(method = "getModels", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/ImmutableMap$Builder;build()Lcom/google/common/collect/ImmutableMap;", remap = false))
    private static void registerBBModels(CallbackInfoReturnable<Map<EntityModelLayer, TexturedModelData>> info, @Local ImmutableMap.Builder<EntityModelLayer, TexturedModelData> builder) {
        for (Map.Entry<EntityModelLayer, EntityLayerRenderer.TexturedModelProvider> entry : EntityLayerRenderer.MODEL_PROVIDER.entrySet()) {
            builder.put(entry.getKey(), entry.getValue().createData());
        }
    }
}
