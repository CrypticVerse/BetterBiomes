package net.crypticverse.betterbiomes.item;

import com.google.common.collect.ImmutableList;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.lang.reflect.Field;
import java.util.List;

public class BetterBiomesItemGroup {
    public static final List<Block> BLOCK_BLACKLIST = ImmutableList.of(BiomeBlocks.STANDING_MAPLE_SIGN, BiomeBlocks.HANGING_MAPLE_SIGN,
            BiomeBlocks.WALL_HANGING_MAPLE_SIGN, BiomeBlocks.WALL_MAPLE_SIGN, BiomeBlocks.TAPPED_BUCKET);


    public static final CreativeModeTab BETTER_BIOMES_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, "betterbiomes"),
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).icon(() -> new ItemStack(BiomeBlocks.MAPLE_PLANKS))
                    .title(Component.translatable("itemgroup.betterbiomes"))
                    .displayItems((displayContext, entries) -> {
                        for (Field field : BiomeBlocks.class.getFields()) {
                            try {
                                Block block = (Block) field.get(null);

                                if (block == null) {
                                    throw new IllegalStateException("Field " + field.getName() + " cannot be null");
                                }

                                if (!BLOCK_BLACKLIST.contains(block)) {
                                    entries.accept(new ItemStack(block));
                                }
                            } catch (IllegalAccessException ignored) {}
                        }
                        for (Field field : BiomeItems.class.getFields()) {
                            if (field.getType() != Item.class) continue;
                            try {
                                Item item = (Item) field.get(null);

                                if (item == null) {
                                    throw new IllegalStateException("Field " + field.getName() + " cannot be null");
                                }

                                entries.accept(new ItemStack(item));
                            } catch (IllegalAccessException ignored) {}
                        }
                    }).build());


    public static void registerItemGroups() {
        BetterBiomes.LOGGER.info("Registering Item Groups for " + BetterBiomes.MOD_ID);
    }

    private static void registerItems() {

    }
}