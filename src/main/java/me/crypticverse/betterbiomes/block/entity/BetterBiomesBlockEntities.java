package me.crypticverse.betterbiomes.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import me.crypticverse.betterbiomes.BetterBiomes;
import me.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterBiomesBlockEntities {
    public static final BlockEntityType<MapleSyrupBoilerBlockEntity> MAPLE_SYRUP_BOILER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BetterBiomes.MOD_ID, "gem_polishing_be"),
                    FabricBlockEntityTypeBuilder.create(MapleSyrupBoilerBlockEntity::new,
                            BiomeBlocks.MAPLE_SYRUP_BOILER).build());

    public static void registerBlockEntities() {
        BetterBiomes.LOGGER.info("Registering Block Entities for " + BetterBiomes.MOD_ID);
    }
}