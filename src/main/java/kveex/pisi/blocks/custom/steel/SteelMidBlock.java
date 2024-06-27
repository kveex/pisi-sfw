package kveex.pisi.blocks.custom.steel;

import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
import kveex.pisi.sounds.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
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

public class SteelMidBlock extends Block {
    public static final DirectionProperty FACING = Properties.FACING;

    public SteelMidBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.FACING, Direction.UP));
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
        return (BlockState)this.getDefaultState()
                .with(Properties.FACING, ctx.getSide().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getItemCooldownManager().isCoolingDown(Blocks.AIR.asItem()) &&
                (player.getMainHandStack().getItem() instanceof PickaxeItem)) {

            world.setBlockState(pos, ModBlocks.STEEL_BLOCK_MIN.getDefaultState());
            world.addBlockBreakParticles(pos, state);
            world.playSoundAtBlockCenter(pos, ModSounds.STEEL_BLOCK_PLACE, SoundCategory.BLOCKS, 1f, 1f, true);

            //player.dropItem(new ItemStack(ModItems.STEEL_INGOT), false, true);
            player.dropStack(new ItemStack(ModItems.STEEL_INGOT), 0);
            player.getItemCooldownManager().set(Blocks.AIR.asItem(), 15);
            player.spawnSweepAttackParticles();
        }
        return ActionResult.PASS;
    }
}
