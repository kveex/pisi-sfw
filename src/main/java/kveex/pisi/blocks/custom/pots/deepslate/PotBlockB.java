package kveex.pisi.blocks.custom.pots.deepslate;

import kveex.pisi.blocks.blockEntities.pots.deepslate.PotBlockBEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class PotBlockB extends DecoratedPotBlock {

    public PotBlockB(Settings settings) {
        super(settings);
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PotBlockBEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
