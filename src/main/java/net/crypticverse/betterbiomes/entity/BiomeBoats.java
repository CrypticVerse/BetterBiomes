package net.crypticverse.betterbiomes.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BiomeBoats {
    public static final Identifier MAPLE_BOAT_ID = new Identifier(BetterBiomes.MOD_ID, "maple_boat");
    public static final Identifier MAPLE_CHEST_BOAT_ID = new Identifier(BetterBiomes.MOD_ID, "maple_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAPLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAPLE_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType mapleBoat = new TerraformBoatType.Builder()
                .item(BiomeItems.MAPLE_BOAT)
                .chestItem(BiomeItems.MAPLE_CHEST_BOAT)
                .planks(BiomeBlocks.MAPLE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAPLE_BOAT_KEY, mapleBoat);
    }

}
