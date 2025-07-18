package net.crypticverse.betterbiomes.util;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BBWoodTypes {
    public static final WoodType MAPLE_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK)
            .register(Identifier.of(BetterBiomes.MOD_ID, "maple"), BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
                    .register(Identifier.of(BetterBiomes.MOD_ID, "maple")));
}
