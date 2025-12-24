package net.crypticverse.betterbiomes.item;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.entity.BBEntityTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class BiomeItems {
    public static final Identifier MAPLE_BOAT_ID = Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple");

    public static final Item MAPLE_SIGN = registerStandingSign("maple_sign", BiomeBlocks.STANDING_MAPLE_SIGN, BiomeBlocks.WALL_MAPLE_SIGN);
    public static final Item HANGING_MAPLE_SIGN = registerHangingSign("maple_hanging_sign", BiomeBlocks.HANGING_MAPLE_SIGN, BiomeBlocks.WALL_HANGING_MAPLE_SIGN);
    public static final Item MAPLE_BOAT = registerItem("maple_boat", settings -> new BoatItem(BBEntityTypes.MAPLE_BOAT, settings.stacksTo(1)));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", settings -> new BoatItem(BBEntityTypes.MAPLE_CHEST_BOAT, settings.stacksTo(1)));

    public static final Item TAPPED_MAPLE_SAP_BUCKET = registerItem("tapped_maple_sap_bucket", Item::new);

    public static final Item TAPPED_BUCKET = registerItem("tapped_bucket",
            createAliasedBlockItem(BiomeBlocks.TAPPED_BUCKET));

    public static final Item UNCURED_MAPLE_SYRUP = registerItem("uncured_maple_syrup",
            Item::new);

    public static final Item PANCAKE = registerItem("pancake", settings -> new Item(settings.food(BiomeFoodComponents.PANCAKE)));
    public static final Item MAPLE_PANCAKE = registerItem("maple_pancake",settings -> new Item(settings.food(BiomeFoodComponents.MAPLE_PANCAKE)));
    public static final Item CHOCOLATE_PANCAKE = registerItem("chocolate_pancake",settings -> new Item(settings.food(BiomeFoodComponents.CHOCOLATE_PANCAKE)));
    public static final Item PANCAKE_STACK = registerItem("pancake_stack",settings -> new Item(settings.food(BiomeFoodComponents.PANCAKE_STACK)));
    public static final Item MAPLE_PANCAKE_STACK = registerItem("maple_pancake_stack", settings -> new Item(settings.food(BiomeFoodComponents.MAPLE_PANCAKE_STACK)));
    public static final Item CHOCOLATE_PANCAKE_STACK = registerItem("chocolate_pancake_stack", settings -> new Item(settings.food(BiomeFoodComponents.CHOCOLATE_PANCAKE_STACK)));

    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name)))));
    }

    private static Item registerStandingSign(String name, Block standingSign, Block wallSign) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name));
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name),
                new SignItem(standingSign, wallSign, new Item.Properties().stacksTo(16).setId(key).useBlockDescriptionPrefix()));
    }

    private static HangingSignItem registerHangingSign(String name, Block hanging, Block wallHangingSign) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name));
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name),
                new HangingSignItem(hanging, wallHangingSign, new Item.Properties().stacksTo(16).setId(key).useBlockDescriptionPrefix()));
    }

    private static Function<Item.Properties, Item> createAliasedBlockItem(Block block) {
        return settings -> new BlockItem(block, settings.useItemDescriptionPrefix());
    }

    public static void registerItems() {
        BetterBiomes.LOGGER.info("Registering Maple Items for" + BetterBiomes.MOD_ID);
    }
}
