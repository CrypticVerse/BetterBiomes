package net.crypticverse.betterbiomes.compat.rei;

import java.util.LinkedList;
import java.util.List;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BiomeBlocks;

public class MapleSyrupCategory implements DisplayCategory<BasicDisplay> {
    public static final ResourceLocation TEXTURE =
            new ResourceLocation(BetterBiomes.MOD_ID, "textures/gui/maple_syrup_boiler_gui.png");
    public static final CategoryIdentifier<MapleSyrupDisplay> MAPLE_SYRUP =
            CategoryIdentifier.of(BetterBiomes.MOD_ID, "maple_syrup");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return MAPLE_SYRUP;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Gem Polishing Station");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(BiomeBlocks.MAPLE_SYRUP_BOILER.asItem().getDefaultInstance());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 11))
                .entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 59))
                .markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}