package fr.silenthill99.arcadia_mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class Container extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(-2, 29, 0, 18, 30, 32),
            Block.box(-16, 0, 0, 32, 16, 32),
            Block.box(-15, 16, 0, 31, 17, 32),
            Block.box(-14, 17, 0, 30, 18, 32),
            Block.box(-13, 18, 0, 29, 19, 32),
            Block.box(-12, 19, 0, 28, 20, 32),
            Block.box(-11, 20, 0, 27, 21, 32),
            Block.box(-10, 21, 0, 26, 22, 32),
            Block.box(-9, 22, 0, 25, 23, 32),
            Block.box(-8, 23, 0, 24, 24, 32),
            Block.box(-7, 24, 0, 23, 25, 32),
            Block.box(-6, 25, 0, 22, 26, 32),
            Block.box(-5, 26, 0, 21, 27, 32),
            Block.box(-4, 27, 0, 20, 28, 32),
            Block.box(-3, 28, 0, 19, 29, 32),
            Block.box(-1, 30, 0, 17, 31, 32),
            Block.box(0, 31, 0, 16, 32, 32)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.box(-2, 29, -16, 18, 30, 16),
            Block.box(-16, 0, -16, 32, 16, 16),
            Block.box(-15, 16, -16, 31, 17, 16),
            Block.box(-14, 17, -16, 30, 18, 16),
            Block.box(-13, 18, -16, 29, 19, 16),
            Block.box(-12, 19, -16, 28, 20, 16),
            Block.box(-11, 20, -16, 27, 21, 16),
            Block.box(-10, 21, -16, 26, 22, 16),
            Block.box(-9, 22, -16, 25, 23, 16),
            Block.box(-8, 23, -16, 24, 24, 16),
            Block.box(-7, 24, -16, 23, 25, 16),
            Block.box(-6, 25, -16, 22, 26, 16),
            Block.box(-5, 26, -16, 21, 27, 16),
            Block.box(-4, 27, -16, 20, 28, 16),
            Block.box(-3, 28, -16, 19, 29, 16),
            Block.box(-1, 30, -16, 17, 31, 16),
            Block.box(0, 31, -16, 16, 32, 16)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(-16, 29, -2, 16, 30, 18),
            Block.box(-16, 0, -16, 16, 16, 32),
            Block.box(-16, 16, -15, 16, 17, 31),
            Block.box(-16, 17, -14, 16, 18, 30),
            Block.box(-16, 18, -13, 16, 19, 29),
            Block.box(-16, 19, -12, 16, 20, 28),
            Block.box(-16, 20, -11, 16, 21, 27),
            Block.box(-16, 21, -10, 16, 22, 26),
            Block.box(-16, 22, -9, 16, 23, 25),
            Block.box(-16, 23, -8, 16, 24, 24),
            Block.box(-16, 24, -7, 16, 25, 23),
            Block.box(-16, 25, -6, 16, 26, 22),
            Block.box(-16, 26, -5, 16, 27, 21),
            Block.box(-16, 27, -4, 16, 28, 20),
            Block.box(-16, 28, -3, 16, 29, 19),
            Block.box(-16, 30, -1, 16, 31, 17),
            Block.box(-16, 31, 0, 16, 32, 16)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    private static final  VoxelShape SHAPE_O = Stream.of(
            Block.box(0, 29, -2, 32, 30, 18),
            Block.box(0, 0, -16, 32, 16, 32),
            Block.box(0, 16, -15, 32, 17, 31),
            Block.box(0, 17, -14, 32, 18, 30),
            Block.box(0, 18, -13, 32, 19, 29),
            Block.box(0, 19, -12, 32, 20, 28),
            Block.box(0, 20, -11, 32, 21, 27),
            Block.box(0, 21, -10, 32, 22, 26),
            Block.box(0, 22, -9, 32, 23, 25),
            Block.box(0, 23, -8, 32, 24, 24),
            Block.box(0, 24, -7, 32, 25, 23),
            Block.box(0, 25, -6, 32, 26, 22),
            Block.box(0, 26, -5, 32, 27, 21),
            Block.box(0, 27, -4, 32, 28, 20),
            Block.box(0, 28, -3, 32, 29, 19),
            Block.box(0, 30, -1, 32, 31, 17),
            Block.box(0, 31, 0, 32, 32, 16)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn_, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(FACING)) {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_O;
            default:
                return SHAPE_N;
        }
    }

    public Container() {
        super(AbstractBlock.Properties.of(Material.STONE));

        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }
}
