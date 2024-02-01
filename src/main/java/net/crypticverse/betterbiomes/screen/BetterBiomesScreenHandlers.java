package net.crypticverse.betterbiomes.screen;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;

public class BetterBiomesScreenHandlers {
    public static final MenuType<MapleSyrupScreenHandler> MAPLE_SYRUP_SCREEN_HANDLER =
            Registry.register(BuiltInRegistries.MENU, new ResourceLocation(BetterBiomes.MOD_ID, "maple_syrup"),
                    new ExtendedScreenHandlerType<>(MapleSyrupScreenHandler::new));

    public static void registerScreenHandlers() {
        BetterBiomes.LOGGER.info("Registering Screen Handlers for " + BetterBiomes.REGISTRY_ID);
        BetterBiomes.LOGGER.info("Successfully Registered Screen Handlers for " + BetterBiomes.REGISTRY_ID);
    }
}
