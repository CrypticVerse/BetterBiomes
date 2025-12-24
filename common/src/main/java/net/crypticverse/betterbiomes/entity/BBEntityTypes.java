package net.crypticverse.betterbiomes.entity;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class BBEntityTypes {
    public static EntityType<Boat> MAPLE_BOAT = register(
            "maple_boat", EntityType.Builder.of(boatFactory(() -> BiomeItems.MAPLE_BOAT), MobCategory.MISC)
                    .noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)
    );
    public static EntityType<ChestBoat> MAPLE_CHEST_BOAT = register(
            "maple_chest_boat", EntityType.Builder.of(chestBoatFactory(() -> BiomeItems.MAPLE_CHEST_BOAT), MobCategory.MISC)
                    .noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)
    );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name));
        var type = builder.build(key);
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(BetterBiomes.MOD_ID, name), type);
    }

    private static EntityType.EntityFactory<Boat> boatFactory(Supplier<Item> droppedItem) {
        return (type, world) -> new Boat(type, world , droppedItem);
    }
    private static EntityType.EntityFactory<ChestBoat> chestBoatFactory(Supplier<Item> droppedItem) {
        return (type, world) -> new ChestBoat(type, world , droppedItem);
    }
}
