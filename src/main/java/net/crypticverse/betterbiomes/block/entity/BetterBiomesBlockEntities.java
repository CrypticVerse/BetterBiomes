package net.crypticverse.betterbiomes.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;

public class BetterBiomesBlockEntities {
    public static final BlockEntityType<MapleSyrupBoilerBlockEntity> MAPLE_SYRUP_BOILER_BLOCK_ENTITY =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(BetterBiomes.MOD_ID, "maple_syrup_be"),
                    FabricBlockEntityTypeBuilder.create(MapleSyrupBoilerBlockEntity::new,
                            BiomeBlocks.MAPLE_SYRUP_BOILER).build());

    public static void registerBlockEntities() {
        BetterBiomes.LOGGER.info("Registering Block Entities for " + BetterBiomes.REGISTRY_ID);
        BetterBiomes.LOGGER.info("Successfully Registered Block Entities for " + BetterBiomes.REGISTRY_ID);
    }
}