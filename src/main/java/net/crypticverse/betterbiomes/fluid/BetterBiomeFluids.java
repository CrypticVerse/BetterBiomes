package net.crypticverse.betterbiomes.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;

import net.crypticverse.betterbiomes.BetterBiomes;

public class BetterBiomeFluids {
    public static FlowingFluid STILL_MAPLE_SYRUP;
    public static FlowingFluid FLOWING_MAPLE_SYRUP;
    public static Block MAPLE_SYRUP_BLOCK;
    public static Item MAPLE_SYRUP_BUCKET;

    public static void register() {
        STILL_MAPLE_SYRUP = Registry.register(BuiltInRegistries.FLUID,
                new ResourceLocation(BetterBiomes.MOD_ID, "maple_syrup"), new MapleSyrupFluid.Still());
        FLOWING_MAPLE_SYRUP = Registry.register(BuiltInRegistries.FLUID,
                new ResourceLocation(BetterBiomes.MOD_ID, "flowing_maple_syrup"), new MapleSyrupFluid.Flowing());

        MAPLE_SYRUP_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, "maple_syrup_block"),
                new LiquidBlock(BetterBiomeFluids.STILL_MAPLE_SYRUP, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        MAPLE_SYRUP_BUCKET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BetterBiomes.MOD_ID, "maple_syrup_bucket"),
                new BucketItem(BetterBiomeFluids.STILL_MAPLE_SYRUP, new FabricItemSettings().craftRemainder(Items.BUCKET).stacksTo(1)));
        BetterBiomes.LOGGER.info("Registering Fluids for " + BetterBiomes.REGISTRY_ID);
    }
}
