package me.crypticverse.betterbiomes.item;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import me.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BetterBiomesGroup {
    public static final ItemGroup BETTER_BIOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterBiomes.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betterbiomes"))
                    .icon(() -> new ItemStack(BetterBiomeFluids.MAPLE_SYRUP_BUCKET)).entries((displayContext, entries) -> {
                        entries.add(BetterBiomeFluids.MAPLE_SYRUP_BUCKET);
                        entries.add(BiomeBlocks.MAPLE_LOG);
                        entries.add(BiomeBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(BiomeBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(BiomeBlocks.MAPLE_WOOD);
                        entries.add(BiomeBlocks.MAPLE_SAPLING);
                        entries.add(BiomeBlocks.MAPLE_LEAVES);
                        entries.add(BiomeBlocks.MAPLE_PLANKS);
                        entries.add(BiomeItems.MAPLE_SYRUP_BOTTLE);
                        entries.add(BiomeItems.MAPLE_SIGN);
                        entries.add(BiomeItems.HANGING_MAPLE_SIGN);
                        entries.add(BiomeItems.MAPLE_BOAT);
                        entries.add(BiomeItems.MAPLE_CHEST_BOAT);
                        entries.add(BiomeBlocks.MAPLE_SYRUP_BOILER);

                        entries.add(BiomeBlocks.MAPLE_SLAB);
                        entries.add(BiomeBlocks.MAPLE_STAIRS);
                        entries.add(BiomeBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(BiomeBlocks.MAPLE_BUTTON);
                        entries.add(BiomeBlocks.MAPLE_FENCE);
                        entries.add(BiomeBlocks.MAPLE_FENCE_GATE);
                        entries.add(BiomeBlocks.MAPLE_TRAPDOOR);
                        entries.add(BiomeBlocks.MAPLE_DOOR);






                    }).build());


    public static void registerItemGroups() {
        BetterBiomes.LOGGER.info("Registering Item Groups for " + BetterBiomes.MOD_ID);
    }
}