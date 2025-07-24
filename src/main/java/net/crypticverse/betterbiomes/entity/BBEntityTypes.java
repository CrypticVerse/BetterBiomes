package net.crypticverse.betterbiomes.entity;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.item.BiomeItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class BBEntityTypes {
    public static EntityType<BoatEntity> MAPLE_BOAT = register(
            "maple_boat", EntityType.Builder.create(boatFactory(() -> BiomeItems.MAPLE_BOAT), SpawnGroup.MISC)
                    .dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10)
    );
    public static EntityType<ChestBoatEntity> MAPLE_CHEST_BOAT = register(
            "maple_chest_boat", EntityType.Builder.create(chestBoatFactory(() -> BiomeItems.MAPLE_CHEST_BOAT), SpawnGroup.MISC)
                    .dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10)
    );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(BetterBiomes.MOD_ID, name));
        var type = builder.build(key);
        return Registry.register(Registries.ENTITY_TYPE, Identifier.of(BetterBiomes.MOD_ID, name), type);
    }

    private static EntityType.EntityFactory<BoatEntity> boatFactory(Supplier<Item> droppedItem) {
        return (type, world) -> new BoatEntity(type, world , droppedItem);
    }
    private static EntityType.EntityFactory<ChestBoatEntity> chestBoatFactory(Supplier<Item> droppedItem) {
        return (type, world) -> new ChestBoatEntity(type, world , droppedItem);
    }
}
