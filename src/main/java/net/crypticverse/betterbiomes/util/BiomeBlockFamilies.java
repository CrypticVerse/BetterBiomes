package net.crypticverse.betterbiomes.util;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

import static net.crypticverse.betterbiomes.block.BiomeBlocks.*;

public class BiomeBlockFamilies {
    public static final BlockFamily MAPLE_SIGN = register(MAPLE_PLANKS, STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN);
    public static final BlockFamily MAPLE_HANGING_SIGN = register(STRIPPED_MAPLE_LOG, HANGING_MAPLE_SIGN, WALL_HANGING_MAPLE_SIGN);

    private static BlockFamily register(Block base, Block sign1, Block sign2) {
        return BlockFamilies.register(base).sign(sign1, sign2).group("wooden").unlockCriterionName("has_planks").build();
    }
}
