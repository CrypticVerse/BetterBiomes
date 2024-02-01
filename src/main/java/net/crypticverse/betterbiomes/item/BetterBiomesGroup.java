package net.crypticverse.betterbiomes.item;

import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BetterBiomesGroup {
    public static final CreativeModeTab BETTER_BIOMES_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(BetterBiomes.MOD_ID, "betterbiomes"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.betterbiomes"))
                    .icon(() -> new ItemStack(BiomeBlocks.MAPLE_LOG)).displayItems((displayContext, entries) -> {
                        entries.accept(BetterBiomeFluids.MAPLE_SYRUP_BUCKET);
                        entries.accept(BiomeBlocks.MAPLE_LOG);
                        entries.accept(BiomeBlocks.STRIPPED_MAPLE_WOOD);
                        entries.accept(BiomeBlocks.STRIPPED_MAPLE_LOG);
                        entries.accept(BiomeBlocks.MAPLE_WOOD);
                        entries.accept(BiomeBlocks.MAPLE_SAPLING);
                        entries.accept(BiomeBlocks.MAPLE_LEAVES);
                        entries.accept(BiomeBlocks.MAPLE_PLANKS);
                        entries.accept(BiomeItems.MAPLE_SYRUP_BOTTLE);
                        entries.accept(BiomeItems.MAPLE_SIGN);
                        entries.accept(BiomeItems.HANGING_MAPLE_SIGN);
                        entries.accept(BiomeItems.MAPLE_BOAT);
                        entries.accept(BiomeItems.MAPLE_CHEST_BOAT);
                        entries.accept(BiomeItems.PANCAKE);
                        entries.accept(BiomeItems.PANCAKE_STACK);
                        entries.accept(BiomeItems.MAPLE_PANCAKE);
                        entries.accept(BiomeItems.MAPLE_PANCAKE_STACK);
                        entries.accept(BiomeItems.CHOCOLATE_PANCAKE);
                        entries.accept(BiomeItems.CHOCOLATE_PANCAKE_STACK);
                        entries.accept(BiomeBlocks.MAPLE_SYRUP_BOILER);

                        entries.accept(BiomeBlocks.MAPLE_SLAB);
                        entries.accept(BiomeBlocks.MAPLE_STAIRS);
                        entries.accept(BiomeBlocks.MAPLE_PRESSURE_PLATE);
                        entries.accept(BiomeBlocks.MAPLE_BUTTON);
                        entries.accept(BiomeBlocks.MAPLE_FENCE);
                        entries.accept(BiomeBlocks.MAPLE_FENCE_GATE);
                        entries.accept(BiomeBlocks.MAPLE_TRAPDOOR);
                        entries.accept(BiomeBlocks.MAPLE_DOOR);






                    }).build());


    public static void registerItemGroups() {
        BetterBiomes.LOGGER.info("Registering Item Groups for " + BetterBiomes.MOD_ID);
    }
}