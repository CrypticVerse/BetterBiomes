package net.crypticverse.betterbiomes.block.entity;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterBiomesBlockEntities {
    public static final BlockEntityType<MapleSyrupBoilerBlockEntity> MAPLE_SYRUP_BOILER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BetterBiomes.MOD_ID, "maple_syrup_be"),
                    FabricBlockEntityTypeBuilder.create(MapleSyrupBoilerBlockEntity::new,
                            BiomeBlocks.MAPLE_SYRUP_BOILER).build());

    public static void registerBlockEntities() {
        BetterBiomes.LOGGER.info("Registering Block Entities for " + BetterBiomes.MOD_ID);
    }
}