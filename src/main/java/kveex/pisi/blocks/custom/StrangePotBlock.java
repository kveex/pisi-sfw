package kveex.pisi.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class StrangePotBlock extends HorizontalFacingBlock {
    public static final VoxelShape SHAPE = StrangePotBlock.createCuboidShape(1.0, 0, 1.0, 15, 16, 15);
    public StrangePotBlock(Settings settings) {
        super(settings);
    }
    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
