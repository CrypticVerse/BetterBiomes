package net.crypticverse.betterbiomes.fabric;

import net.crypticverse.betterbiomes.BetterBiomesClient;
import net.fabricmc.api.ClientModInitializer;

public class BetterBiomesFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterBiomesClient.initClient();
    }
}
