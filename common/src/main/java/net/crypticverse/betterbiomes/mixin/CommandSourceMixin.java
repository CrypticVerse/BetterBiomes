package net.crypticverse.betterbiomes.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.commands.SharedSuggestionProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

// See: https://github.com/FabricMC/fabric/pull/4755
@Mixin(SharedSuggestionProvider.class)
public interface CommandSourceMixin {
    @ModifyExpressionValue(
            method = "filterResources(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Consumer;)V",
            at = @At(value = "INVOKE", target = "Ljava/lang/String;equals(Ljava/lang/Object;)Z", ordinal = 0)
    )
    private static boolean allowBBAccess(boolean original) {
        return true;
    }
}
