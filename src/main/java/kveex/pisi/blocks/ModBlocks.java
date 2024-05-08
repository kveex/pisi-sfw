package kveex.pisi.blocks;

import kveex.pisi.Pisi;
import kveex.pisi.blocks.custom.GunpowderBlock;
import kveex.pisi.blocks.custom.SeedsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Registering blocks----------------------------------------------------------------------------------------------\\
    //Blocks
    public static final Block GUNPOWDER_BLOCK = registerBlocks("gunpowder_block",
            new GunpowderBlock(FabricBlockSettings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block BLOCK_OF_SEEDS = registerBlocks("block_of_seeds", new SeedsBlock(FabricBlockSettings.create().strength(0.5f).sounds(BlockSoundGroup.GRASS)));
    //----------------------------------------------------------------------------------------------------------------\\
    public static Block registerBlocks(String id, Block block) {                                //Block register method
        registerItemBlock(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(Pisi.MOD_ID, id), block);
    }

    public static Item registerItemBlock(String id, Block block) {                              //Item for block register method
        return Registry.register(Registries.ITEM, new Identifier(Pisi.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Pisi.LOGGER.info("PisiBlocks");
    }

}
