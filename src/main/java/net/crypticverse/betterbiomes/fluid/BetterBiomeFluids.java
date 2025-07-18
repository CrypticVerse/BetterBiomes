package net.crypticverse.betterbiomes.fluid;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


import static net.crypticverse.betterbiomes.block.BiomeBlocks.registerBlockWithoutItem;
import static net.crypticverse.betterbiomes.item.BiomeItems.registerItem;

public class BetterBiomeFluids {
    public static FlowableFluid STILL_MAPLE_SYRUP;
    public static FlowableFluid FLOWING_MAPLE_SYRUP;
    public static Block MAPLE_SYRUP_BLOCK;
    public static Item MAPLE_SYRUP_BUCKET;
    public static final RegistryKey<Fluid> STILL_KEY = RegistryKey.of(RegistryKeys.FLUID, Identifier.of(BetterBiomes.MOD_ID, "maple_syrup"));
    public static final RegistryKey<Fluid> FLOWING_KEY = RegistryKey.of(RegistryKeys.FLUID, Identifier.of(BetterBiomes.MOD_ID, "flowing_maple_syrup"));

    public static void register() {
        STILL_MAPLE_SYRUP = Registry.register(Registries.FLUID, STILL_KEY.getValue(), new MapleSyrupFluid.Still());
        FLOWING_MAPLE_SYRUP = Registry.register(Registries.FLUID, FLOWING_KEY.getValue(), new MapleSyrupFluid.Flowing());
        MAPLE_SYRUP_BLOCK = registerBlockWithoutItem("maple_syrup_block",
                settings -> new FluidBlock(BetterBiomeFluids.STILL_MAPLE_SYRUP, settings), AbstractBlock.Settings.copy(Blocks.WATER));
        MAPLE_SYRUP_BUCKET = registerItem("maple_syrup_bucket",
                settings -> new BucketItem(BetterBiomeFluids.STILL_MAPLE_SYRUP, settings.recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
