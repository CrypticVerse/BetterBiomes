package net.crypticverse.betterbiomes.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.command.CommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

// See: https://github.com/FabricMC/fabric/pull/4755
@Mixin(CommandSource.class)
public interface CommandSourceMixin {
    @ModifyExpressionValue(
            method = "forEachMatching(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Consumer;)V",
            at = @At(value = "INVOKE", target = "Ljava/lang/String;equals(Ljava/lang/Object;)Z", ordinal = 0)
    )
    private static boolean allowBBAccess(boolean original) {
        return true;
    }
}
