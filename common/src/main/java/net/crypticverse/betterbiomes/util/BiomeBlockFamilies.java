package net.crypticverse.betterbiomes.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;

import static net.crypticverse.betterbiomes.block.BiomeBlocks.*;

public class BiomeBlockFamilies {
    public static final BlockFamily MAPLE_SIGN = register(MAPLE_PLANKS, STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN);
    public static final BlockFamily MAPLE_HANGING_SIGN = register(STRIPPED_MAPLE_LOG, HANGING_MAPLE_SIGN, WALL_HANGING_MAPLE_SIGN);

    private static BlockFamily register(Block base, Block sign1, Block sign2) {
        return BlockFamilies.familyBuilder(base).sign(sign1, sign2).recipeGroupPrefix("wooden").recipeUnlockedBy("has_planks").getFamily();
    }
}
