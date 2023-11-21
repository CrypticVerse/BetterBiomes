package net.crypticverse.betterbiomes.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.entity.BiomeBoats;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BiomeItems {

    public static final Item MAPLE_SYRUP_BOTTLE = registerItem("maple_syrup_bottle", new Item(new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE).food(BiomeFoodComponents.MAPLE_SYRUP_BOTTLE).maxCount(16)));
    public static final Item MAPLE_SIGN = registerItem("maple_sign", new SignItem(new FabricItemSettings().maxCount(16), BiomeBlocks.STANDING_MAPLE_SIGN, BiomeBlocks.WALL_MAPLE_SIGN));
    public static final Item HANGING_MAPLE_SIGN = registerItem("maple_hanging_sign", new HangingSignItem(BiomeBlocks.HANGING_MAPLE_SIGN, BiomeBlocks.WALL_HANGING_MAPLE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(BiomeBoats.MAPLE_BOAT_ID, BiomeBoats.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(BiomeBoats.MAPLE_CHEST_BOAT_ID, BiomeBoats.MAPLE_BOAT_KEY, true);

    public static final Item TAPPED_MAPLE_SAP_BUCKET = registerItem("tapped_maple_sap_bucket",
            new AliasedBlockItem(BiomeBlocks.TAPPED_BUCKET, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, new Identifier(BetterBiomes.MOD_ID, name), item);
    }

    public static void registerMapleItems() {
        BetterBiomes.LOGGER.info("Registering Maple Items for" + BetterBiomes.MOD_ID);
    }
}
