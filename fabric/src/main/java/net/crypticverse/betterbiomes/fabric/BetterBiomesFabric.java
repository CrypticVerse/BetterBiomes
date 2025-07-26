package net.crypticverse.betterbiomes.fabric;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.fabricmc.api.ModInitializer;

public class BetterBiomesFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        BetterBiomes.init();
    }
}
