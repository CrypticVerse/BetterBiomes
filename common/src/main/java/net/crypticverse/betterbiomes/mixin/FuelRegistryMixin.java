package net.crypticverse.betterbiomes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.crypticverse.betterbiomes.block.FuelingBlocks;
import net.minecraft.world.level.block.entity.FuelValues;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FuelValues.class)
public class FuelRegistryMixin {
    @WrapOperation(
            method = "vanillaBurnTimes(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/flag/FeatureFlagSet;I)Lnet/minecraft/world/level/block/entity/FuelValues;",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/entity/FuelValues$Builder;build()Lnet/minecraft/world/level/block/entity/FuelValues;")
    )
    private static FuelValues addFuelBlocks(FuelValues.Builder instance, Operation<FuelValues> original) {
        FuelingBlocks.registerFuelingBlocks(instance);
        return instance.build();
    }
}
