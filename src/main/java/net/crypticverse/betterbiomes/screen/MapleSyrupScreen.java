package net.crypticverse.betterbiomes.screen;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import net.crypticverse.betterbiomes.BetterBiomes;

public class MapleSyrupScreen extends AbstractContainerScreen<MapleSyrupScreenHandler> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(BetterBiomes.MOD_ID, "textures/gui/maple_syrup_boiler_gui.png");

    public MapleSyrupScreen(MapleSyrupScreenHandler handler, Inventory inventory, Component title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleLabelY = 1000;
        inventoryLabelY = 1000;
    }

    @Override
    protected void renderBg(GuiGraphics context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        context.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrow(context, x, y);
    }

    private void renderProgressArrow(GuiGraphics context, int x, int y) {
        if(menu.isCrafting()) {
            context.blit(TEXTURE, x + 85, y + 30, 176, 0, 8, menu.getScaledProgress());
        }
    }

    @Override
    public void render(GuiGraphics context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        renderTooltip(context, mouseX, mouseY);
    }
}
