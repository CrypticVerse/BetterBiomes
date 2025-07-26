package net.crypticverse.betterbiomes.block.custom;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class SignBlockHelper {
    private static <T extends SignBlock> T registerSign(ResourceKey<Block> key, T block) {
        if (block instanceof StandingSignBlock || block instanceof WallSignBlock) {
            //BlockEntityType.SIGN.addSupportedBlock(block);
        } else if (block instanceof CeilingHangingSignBlock || block instanceof WallHangingSignBlock) {
            //BlockEntityType.HANGING_SIGN.addSupportedBlock(block);
        } else {
            throw new IllegalArgumentException("Can only accept vanilla Minecraft signs and children!");
        }
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    public static <T extends SignBlock> T registerSign(ResourceLocation id, Function<BlockBehaviour.Properties, T> function, BlockBehaviour.Properties settings) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);

        return registerSign(key, function.apply(settings.setId(key)));
    }
}
