package kveex.pisi.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GunpowderBlock extends FallingBlock {
    public GunpowderBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if ((player.getMainHandStack().isOf(Items.FIRE_CHARGE) || player.getMainHandStack().isOf(Items.FLINT_AND_STEEL))) {
            world.removeBlock(pos, false);
            world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 16.0f, World.ExplosionSourceType.BLOCK);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
