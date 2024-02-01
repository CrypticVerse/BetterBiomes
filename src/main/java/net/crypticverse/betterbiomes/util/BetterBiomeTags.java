package net.crypticverse.betterbiomes.util;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BetterBiomeTags {
    public static class Blocks {
        public static final TagKey<Block> MAPLE_LOGS =
                createTag("maple_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> MAPLE_LOGS =
                createTag("maple_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(BetterBiomes.MOD_ID, name));
        }
    }
}
