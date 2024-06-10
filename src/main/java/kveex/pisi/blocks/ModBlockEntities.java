package kveex.pisi.blocks;

import kveex.pisi.Pisi;
import kveex.pisi.blocks.blockEntities.pots.deepslate.PotBlockBEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.DecoratedPotBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<PotBlockBEntity> POT_BLOCKENTITY_B = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Pisi.MOD_ID, "pot_blockentity_b"), BlockEntityType.Builder.create(PotBlockBEntity::new, ModBlocks.DEEPSLATE_POT_B).build());

    public static void registerBlockEntities() {

    }
}
