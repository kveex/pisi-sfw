package kveex.pisi.blocks.custom.pots;

import net.minecraft.block.*;

public class EasyPotBlock extends DecoratedPotBlock {

    public EasyPotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
