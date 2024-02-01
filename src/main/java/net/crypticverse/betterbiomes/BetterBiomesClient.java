package net.crypticverse.betterbiomes;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.crypticverse.betterbiomes.block.BiomeBlocks;
import net.crypticverse.betterbiomes.entity.BiomeBoats;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.screen.BetterBiomesScreenHandlers;
import net.crypticverse.betterbiomes.screen.MapleSyrupScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

public class BetterBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.MAPLE_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BiomeBlocks.TAPPED_BUCKET, RenderType.cutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, BiomeBlocks.MAPLE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, BiomeBlocks.MAPLE_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(BiomeBoats.MAPLE_BOAT_ID, false);


        FluidRenderHandlerRegistry.INSTANCE.register(BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP,
                new SimpleFluidRenderHandler(
                        new ResourceLocation("minecraft:block/water_still"),
                        new ResourceLocation("minecraft:block/water_flow"),
                        0xA1964B00
                ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderType.translucent(),
                BetterBiomeFluids.STILL_MAPLE_SYRUP, BetterBiomeFluids.FLOWING_MAPLE_SYRUP);

        MenuScreens.register(BetterBiomesScreenHandlers.MAPLE_SYRUP_SCREEN_HANDLER, MapleSyrupScreen::new);

    }
}
