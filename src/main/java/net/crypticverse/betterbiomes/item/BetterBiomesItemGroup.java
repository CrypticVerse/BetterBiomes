package net.crypticverse.betterbiomes.item;

import com.google.common.collect.ImmutableList;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.lang.reflect.Field;
import java.util.List;

public class BetterBiomesItemGroup {
    public static final List<Block> BLOCK_BLACKLIST = ImmutableList.of(BiomeBlocks.STANDING_MAPLE_SIGN, BiomeBlocks.HANGING_MAPLE_SIGN,
            BiomeBlocks.WALL_HANGING_MAPLE_SIGN, BiomeBlocks.WALL_MAPLE_SIGN, BiomeBlocks.TAPPED_BUCKET);


    public static final ItemGroup BETTER_BIOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BetterBiomes.MOD_ID, "betterbiomes"),
            FabricItemGroup.builder().icon(() -> new ItemStack(BiomeBlocks.MAPLE_PLANKS))
                    .displayName(Text.translatable("itemgroup.betterbiomes"))
                    .entries((displayContext, entries) -> {
                        for (Field field : BiomeBlocks.class.getFields()) {
                            try {
                                Block block = (Block) field.get(null);

                                if (block == null) {
                                    throw new IllegalStateException("Field " + field.getName() + " cannot be null");
                                }

                                if (!BLOCK_BLACKLIST.contains(block)) {
                                    entries.add(new ItemStack(block));
                                }
                            } catch (IllegalAccessException ignored) {}
                        }
                        for (Field field : BiomeItems.class.getFields()) {
                            try {
                                Item item = (Item) field.get(null);

                                if (item == null) {
                                    throw new IllegalStateException("Field " + field.getName() + " cannot be null");
                                }

                                entries.add(new ItemStack(item));
                            } catch (IllegalAccessException ignored) {}
                        }
                    }).build());


    public static void registerItemGroups() {
        BetterBiomes.LOGGER.info("Registering Item Groups for " + BetterBiomes.MOD_ID);
    }

    private static void registerItems() {

    }
}