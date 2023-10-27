package me.crypticverse.betterbiomes.data;

import me.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.FluidTags;

import java.util.concurrent.CompletableFuture;

public class FluidTagGen extends FabricTagProvider.FluidTagProvider {
    public FluidTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(FluidTags.LAVA)
                .add(BetterBiomeFluids.FLOWING_MAPLE_SYRUP)
                .add(BetterBiomeFluids.STILL_MAPLE_SYRUP);

    }
}
