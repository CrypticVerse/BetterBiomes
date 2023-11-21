package net.crypticverse.betterbiomes.block.custom;

import net.crypticverse.betterbiomes.util.BetterBiomeTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CocoaBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class TappedBucketBlock extends CocoaBlock {
    public static final int MAX_AGE = 2;
    public static final IntProperty AGE = Properties.AGE_2;
    protected static final VoxelShape[] AGE_TO_EAST_SHAPE = new VoxelShape[]{Block.createCuboidShape(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), Block.createCuboidShape(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), Block.createCuboidShape(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)};
    protected static final VoxelShape[] AGE_TO_WEST_SHAPE = new VoxelShape[]{Block.createCuboidShape(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), Block.createCuboidShape(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), Block.createCuboidShape(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)};
    protected static final VoxelShape[] AGE_TO_NORTH_SHAPE = new VoxelShape[]{Block.createCuboidShape(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), Block.createCuboidShape(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), Block.createCuboidShape(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)};
    protected static final VoxelShape[] AGE_TO_SOUTH_SHAPE = new VoxelShape[]{Block.createCuboidShape(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), Block.createCuboidShape(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), Block.createCuboidShape(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)};
    public TappedBucketBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(AGE, 0));
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(AGE) < 2;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.offset(state.get(FACING)));
        return blockState.isIn(BetterBiomeTags.Blocks.MAPLE_LOGS);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        int i = state.get(AGE);
        switch (state.get(FACING)) {
            case SOUTH: {
                return AGE_TO_SOUTH_SHAPE[i];
            }
            default: {
                return AGE_TO_NORTH_SHAPE[i];
            }
            case WEST: {
                return AGE_TO_WEST_SHAPE[i];
            }
            case EAST:
        }
        return AGE_TO_EAST_SHAPE[i];
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return false;
    }

}
