package kveex.pisi.blocks.custom.steel;

import com.mojang.serialization.MapCodec;
import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
import kveex.pisi.sounds.ModSounds;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SteelMidBlock extends Block {
    public static final DirectionProperty FACING = Properties.FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public SteelMidBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.FACING, Direction.UP).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case UP, DOWN ->  Block.createCuboidShape(4, 0, 4, 12, 16, 12);
            case NORTH, SOUTH -> Block.createCuboidShape(4,4,0,12,12,16);
            case EAST, WEST -> Block.createCuboidShape(0,4,4,16,12,12);
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return (BlockState)this.getDefaultState()
                .with(Properties.FACING, ctx.getSide().getOpposite())
                .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING, WATERLOGGED);
    }
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    /*@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getItemCooldownManager().isCoolingDown(Blocks.AIR.asItem()) &&
                (player.getMainHandStack().getItem() instanceof PickaxeItem)) {
            if (state.get(WATERLOGGED)) {
                world.setBlockState(pos, ModBlocks.STEEL_BLOCK_MIN.getDefaultState()
                        .with(WATERLOGGED, true));

                world.addBlockBreakParticles(pos, ModBlocks.STEEL_BLOCK_FULL.getDefaultState());
                world.playSoundAtBlockCenter(pos, ModSounds.STEEL_BLOCK_PLACE, SoundCategory.BLOCKS, 1f, 1f, true);

                //player.dropItem(new ItemStack(ModItems.STEEL_INGOT), false, true);
                player.dropStack(new ItemStack(ModItems.STEEL_INGOT), 0);
                player.getItemCooldownManager().set(Blocks.AIR.asItem(), 15);
            } else if (!state.get(WATERLOGGED)) {
                world.setBlockState(pos, ModBlocks.STEEL_BLOCK_MIN.getDefaultState());

                world.addBlockBreakParticles(pos, ModBlocks.STEEL_BLOCK_FULL.getDefaultState());
                world.playSoundAtBlockCenter(pos, ModSounds.STEEL_BLOCK_PLACE, SoundCategory.BLOCKS, 1f, 1f, true);

                //player.dropItem(new ItemStack(ModItems.STEEL_INGOT), false, true);
                player.dropStack(new ItemStack(ModItems.STEEL_INGOT), 0);
                player.getItemCooldownManager().set(Item.byRawId(PickaxeItem.getRawId(Items.DIAMOND_PICKAXE.asItem())), 15);

                world.updateNeighbors(pos, this);
            }

        }
        return ActionResult.PASS;
    }*/
}
