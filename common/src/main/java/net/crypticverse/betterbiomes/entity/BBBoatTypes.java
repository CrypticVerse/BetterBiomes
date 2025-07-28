package net.crypticverse.betterbiomes.entity;

import net.crypticverse.betterbiomes.util.BBWoodTypes;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jetbrains.annotations.NotNull;

public enum BBBoatTypes implements StringRepresentable {
    MAPLE(BBWoodTypes.MAPLE_WOOD_TYPE, "maple");


    private final WoodType type;
    private final String name;

    BBBoatTypes(WoodType type, String name) {
        this.type = type;
        this.name = name;
    }

    public @NotNull String getSerializedName() {
        return this.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.type.name();
    }
}
