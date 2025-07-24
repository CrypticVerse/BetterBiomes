package net.crypticverse.betterbiomes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.crypticverse.betterbiomes.block.FuelingBlocks;
import net.minecraft.item.FuelRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FuelRegistry.class)
public class FuelRegistryMixin {
    @WrapOperation(
            method = "createDefault(Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lnet/minecraft/resource/featuretoggle/FeatureSet;I)Lnet/minecraft/item/FuelRegistry;",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/FuelRegistry$Builder;build()Lnet/minecraft/item/FuelRegistry;")
    )
    private static FuelRegistry addFuelBlocks(FuelRegistry.Builder instance, Operation<FuelRegistry> original) {
        FuelingBlocks.registerFuelingBlocks(instance);
        return instance.build();
    }
}
