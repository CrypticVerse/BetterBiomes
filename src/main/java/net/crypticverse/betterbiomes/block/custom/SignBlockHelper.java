package net.crypticverse.betterbiomes.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class SignBlockHelper {
    private static <T extends AbstractSignBlock> T registerSign(RegistryKey<Block> key, T block) {
        if (block instanceof SignBlock || block instanceof WallSignBlock) {
            BlockEntityType.SIGN.addSupportedBlock(block);
        } else if (block instanceof HangingSignBlock || block instanceof WallHangingSignBlock) {
            BlockEntityType.HANGING_SIGN.addSupportedBlock(block);
        } else {
            throw new IllegalArgumentException("Can only accept vanilla Minecraft signs and children!");
        }
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static <T extends AbstractSignBlock> T registerSign(Identifier id, Function<AbstractBlock.Settings, T> function, AbstractBlock.Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);

        return registerSign(key, function.apply(settings.registryKey(key)));
    }
}
