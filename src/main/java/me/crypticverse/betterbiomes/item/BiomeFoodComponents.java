package me.crypticverse.betterbiomes.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BiomeFoodComponents {
    public static final FoodComponent MAPLE_SYRUP_BOTTLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 0), 0.7f).build();
}
