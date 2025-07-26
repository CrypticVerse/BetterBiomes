package net.crypticverse.betterbiomes.fluid;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;


import static net.crypticverse.betterbiomes.block.BiomeBlocks.registerBlockWithoutItem;
import static net.crypticverse.betterbiomes.item.BiomeItems.registerItem;

public class BetterBiomeFluids {
    public static FlowingFluid STILL_MAPLE_SYRUP;
    public static FlowingFluid FLOWING_MAPLE_SYRUP;
    public static Block MAPLE_SYRUP_BLOCK;
    public static Item MAPLE_SYRUP_BUCKET;
    public static final ResourceKey<Fluid> STILL_KEY = ResourceKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple_syrup"));
    public static final ResourceKey<Fluid> FLOWING_KEY = ResourceKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "flowing_maple_syrup"));

    public static void register() {
        STILL_MAPLE_SYRUP = Registry.register(BuiltInRegistries.FLUID, STILL_KEY, new MapleSyrupFluid.Still());
        FLOWING_MAPLE_SYRUP = Registry.register(BuiltInRegistries.FLUID, FLOWING_KEY, new MapleSyrupFluid.Flowing());
        MAPLE_SYRUP_BLOCK = registerBlockWithoutItem("maple_syrup_block",
                settings -> new LiquidBlock(BetterBiomeFluids.STILL_MAPLE_SYRUP, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER));
        MAPLE_SYRUP_BUCKET = registerItem("maple_syrup_bucket",
                settings -> new BucketItem(BetterBiomeFluids.STILL_MAPLE_SYRUP, settings.craftRemainder(Items.BUCKET).stacksTo(1)));
    }
}
