package net.crypticverse.betterbiomes.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

public abstract class MapleSyrupFluid extends FlowingFluid {
    @Override
    protected boolean canConvertToSource(Level world) {
        return false;
    }

    @Override
    protected void beforeDestroyingBlock(LevelAccessor world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropResources(state, world, pos, blockEntity);
    }

    @Override
    protected int getSlopeFindDistance(LevelReader world) {
        return 2;
    }

    @Override
    protected int getDropOff(LevelReader world) {
        return 1;
    }

    @Override
    public boolean isSame(Fluid fluid) {
        return fluid == getSource() || fluid == getFlowing();
    }

    @Override
    public int getAmount(FluidState state) {
        return 0;
    }

    @Override
    public int getTickDelay(LevelReader world) {
        return 30;
    }

    @Override
    protected float getExplosionResistance() {
        return 100f;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockGetter world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    @Override
    public Fluid getSource() {
        return BetterBiomeFluids.STILL_MAPLE_SYRUP;
    }

    @Override
    public Fluid getFlowing() {
        return BetterBiomeFluids.FLOWING_MAPLE_SYRUP;
    }

    @Override
    public Item getBucket() {
        return BetterBiomeFluids.MAPLE_SYRUP_BUCKET;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState state) {
        return BetterBiomeFluids.MAPLE_SYRUP_BLOCK.defaultBlockState().setValue(BlockStateProperties.LEVEL, getLegacyLevel(state));
    }

    @Override
    public boolean isSource(FluidState state) {
        return false;
    }

    public static class Flowing extends MapleSyrupFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Still extends MapleSyrupFluid {
        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
