package net.crypticverse.betterbiomes.neoforge.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;

import java.util.concurrent.CompletableFuture;

public class FluidTagGen extends FluidTagsProvider {
    public FluidTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, BetterBiomes.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(FluidTags.LAVA)
                .add(BetterBiomeFluids.FLOWING_MAPLE_SYRUP)
                .add(BetterBiomeFluids.STILL_MAPLE_SYRUP);

    }
}
