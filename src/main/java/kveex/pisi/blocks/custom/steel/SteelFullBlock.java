package kveex.pisi.blocks.custom.steel;

import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
import kveex.pisi.sounds.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SteelFullBlock extends Block {

    public SteelFullBlock(Settings settings) {
        super(settings);
    }

    /*@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getItemCooldownManager().isCoolingDown(Blocks.AIR.asItem()) &&
                (player.getMainHandStack().getItem() instanceof PickaxeItem)) {

            world.setBlockState(pos, ModBlocks.STEEL_BLOCK_MID.getDefaultState());
            world.addBlockBreakParticles(pos, ModBlocks.STEEL_BLOCK_FULL.getDefaultState());
            world.playSoundAtBlockCenter(pos, ModSounds.STEEL_BLOCK_PLACE, SoundCategory.BLOCKS, 1f, 1f, true);


            //player.dropItem(new ItemStack(ModItems.STEEL_INGOT), false, true);
            player.dropStack(new ItemStack(ModItems.STEEL_INGOT), 0);
            player.getItemCooldownManager().set(Blocks.AIR.asItem(), 15);

            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }*/
}
