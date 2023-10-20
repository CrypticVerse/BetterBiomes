package me.crypticverse.betterbiomes.compat;

import me.crypticverse.betterbiomes.block.BiomeBlocks;
import me.crypticverse.betterbiomes.recipe.MapleSyrupRecipe;
import me.crypticverse.betterbiomes.screen.MapleSyrupScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

public class BetterBiomesREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new MapleSyrupCategory());
        registry.addWorkstations(MapleSyrupCategory.MAPLE_SYRUP, EntryStacks.of(BiomeBlocks.MAPLE_SYRUP_BOILER));
    }
    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(MapleSyrupRecipe.class, MapleSyrupRecipe.Type.INSTANCE,
                MapleSyrupDisplay::new);
    }
    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), MapleSyrupScreen.class,
                MapleSyrupCategory.MAPLE_SYRUP);
    }

}
