package me.crypticverse.betterbiomes.util;

import me.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BetterBiomeTags {
    public static class Blocks {
        public static final TagKey<Block> MAPLE_LOGS =
                createTag("maple_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BetterBiomes.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> MAPLE_LOGS =
                createTag("maple_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BetterBiomes.MOD_ID, name));
        }
    }
}
