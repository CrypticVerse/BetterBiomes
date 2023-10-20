package me.crypticverse.betterbiomes.item;

import me.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BiomeItems {

    public static final Item MAPLE_SYRUP_BOTTLE = registerItem("maple_syrup_bottle", new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE).food(BiomeFoodComponents.MAPLE_SYRUP_BOTTLE).maxCount(16)));


    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, new Identifier(BetterBiomes.MOD_ID, name), item);
    }

    public static void registerMapleItems() {
        BetterBiomes.LOGGER.info("Registering Maple Items for" + BetterBiomes.MOD_ID);
    }
}
