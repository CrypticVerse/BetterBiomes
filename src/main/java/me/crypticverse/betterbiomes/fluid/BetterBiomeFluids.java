package me.crypticverse.betterbiomes.fluid;

import me.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterBiomeFluids {
    public static FlowableFluid STILL_MAPLE_SYRUP;
    public static FlowableFluid FLOWING_MAPLE_SYRUP;
    public static Block MAPLE_SYRUP_BLOCK;
    public static Item MAPLE_SYRUP_BUCKET;

    public static void register() {
        STILL_MAPLE_SYRUP = Registry.register(Registries.FLUID,
                new Identifier(BetterBiomes.MOD_ID, "maple_syrup"), new MapleSyrupFluid.Still());
        FLOWING_MAPLE_SYRUP = Registry.register(Registries.FLUID,
                new Identifier(BetterBiomes.MOD_ID, "flowing_maple_syrup"), new MapleSyrupFluid.Flowing());

        MAPLE_SYRUP_BLOCK = Registry.register(Registries.BLOCK, new Identifier(BetterBiomes.MOD_ID, "maple_syrup_block"),
                new FluidBlock(BetterBiomeFluids.STILL_MAPLE_SYRUP, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        MAPLE_SYRUP_BUCKET = Registry.register(Registries.ITEM, new Identifier(BetterBiomes.MOD_ID, "maple_syrup_bucket"),
                new BucketItem(BetterBiomeFluids.STILL_MAPLE_SYRUP, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
