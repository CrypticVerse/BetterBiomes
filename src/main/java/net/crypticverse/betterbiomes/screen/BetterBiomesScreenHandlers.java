package net.crypticverse.betterbiomes.screen;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class BetterBiomesScreenHandlers {
    public static final ScreenHandlerType<MapleSyrupScreenHandler> MAPLE_SYRUP_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(BetterBiomes.MOD_ID, "maple_syrup"),
                    new ExtendedScreenHandlerType<>(MapleSyrupScreenHandler::new));

    public static void registerScreenHandlers() {
        BetterBiomes.LOGGER.info("Registering Screen Handlers for " + BetterBiomes.REGISTRY_ID);
    }
}
