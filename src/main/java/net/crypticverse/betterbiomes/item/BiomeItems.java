package net.crypticverse.betterbiomes.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BiomeItems {
    public static final Identifier MAPLE_BOAT_ID = Identifier.of(BetterBiomes.MOD_ID, "maple");

    public static final Item MAPLE_SIGN = registerStandingSign("maple_sign", BiomeBlocks.STANDING_MAPLE_SIGN, BiomeBlocks.WALL_MAPLE_SIGN);
    public static final Item HANGING_MAPLE_SIGN = registerHangingSign("maple_hanging_sign", BiomeBlocks.HANGING_MAPLE_SIGN, BiomeBlocks.WALL_HANGING_MAPLE_SIGN);
    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(MAPLE_BOAT_ID, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(MAPLE_BOAT_ID, true);

    public static final Item TAPPED_MAPLE_SAP_BUCKET = registerItem("tapped_maple_sap_bucket", createAliasedBlockItem(BiomeBlocks.TAPPED_BUCKET));

    public static final Item TAPPED_BUCKET = registerItem("tapped_bucket",
            settings -> new BucketItem(BetterBiomeFluids.STILL_MAPLE_SYRUP, settings));

    public static final Item UNCURED_MAPLE_SYRUP = registerItem("uncured_maple_syrup",
            Item::new);

    public static final Item PANCAKE = registerItem("pancake", settings -> new Item(settings.food(BiomeFoodComponents.PANCAKE)));
    public static final Item MAPLE_PANCAKE = registerItem("maple_pancake",settings -> new Item(settings.food(BiomeFoodComponents.MAPLE_PANCAKE)));
    public static final Item CHOCOLATE_PANCAKE = registerItem("chocolate_pancake",settings -> new Item(settings.food(BiomeFoodComponents.CHOCOLATE_PANCAKE)));
    public static final Item PANCAKE_STACK = registerItem("pancake_stack",settings -> new Item(settings.food(BiomeFoodComponents.PANCAKE_STACK)));
    public static final Item MAPLE_PANCAKE_STACK = registerItem("maple_pancake_stack", settings -> new Item(settings.food(BiomeFoodComponents.MAPLE_PANCAKE_STACK)));
    public static final Item CHOCOLATE_PANCAKE_STACK = registerItem("chocolate_pancake_stack", settings -> new Item(settings.food(BiomeFoodComponents.CHOCOLATE_PANCAKE_STACK)));

    public static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterBiomes.MOD_ID, name)))));
    }

    private static Item registerStandingSign(String name, Block standingSign, Block wallSign) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterBiomes.MOD_ID, name));
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                new SignItem(standingSign, wallSign, new Item.Settings().maxCount(16).registryKey(key).useBlockPrefixedTranslationKey()));
    }

    private static HangingSignItem registerHangingSign(String name, Block hanging, Block wallHangingSign) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterBiomes.MOD_ID, name));
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                new HangingSignItem(hanging, wallHangingSign, new Item.Settings().maxCount(16).registryKey(key).useBlockPrefixedTranslationKey()));
    }

    private static Function<Item.Settings, Item> createAliasedBlockItem(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }

    public static void registerMapleItems() {
        BetterBiomes.LOGGER.info("Registering Maple Items for" + BetterBiomes.MOD_ID);
    }
}
