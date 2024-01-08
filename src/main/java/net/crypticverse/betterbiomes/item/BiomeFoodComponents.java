package net.crypticverse.betterbiomes.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BiomeFoodComponents {
    public static final FoodComponent PANCAKE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent MAPLE_PANCAKE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CHOCOLATE_PANCAKE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();

    public static final FoodComponent PANCAKE_STACK = new FoodComponent.Builder().hunger(20).saturationModifier(0.7f).build();
    public static final FoodComponent MAPLE_PANCAKE_STACK = new FoodComponent.Builder().hunger(20).saturationModifier(1f).build();
    public static final FoodComponent CHOCOLATE_PANCAKE_STACK = new FoodComponent.Builder().hunger(20).saturationModifier(1f).build();
}
