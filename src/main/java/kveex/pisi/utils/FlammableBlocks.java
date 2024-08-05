package kveex.pisi.utils;

import kveex.pisi.blocks.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammableBlocks {
    public static final FlammableBlockRegistry FIRE = FlammableBlockRegistry.getDefaultInstance();

    public static void registerFire() {
        //Blocks------------------------------------------------------------------------------------------------------\\
        FIRE.add(ModBlocks.BLOCK_OF_SEEDS, 5, 20);
        //Walls-------------------------------------------------------------------------------------------------------\\
        FIRE.add(ModBlocks.OAK_WALL, 5, 20);
        FIRE.add(ModBlocks.SPRUCE_WALL, 5, 20);
        FIRE.add(ModBlocks.JUNGLE_WALL, 5, 20);
        FIRE.add(ModBlocks.ACACIA_WALL, 5, 20);
        FIRE.add(ModBlocks.DARK_OAK_WALL, 5, 20);
        FIRE.add(ModBlocks.CHERRY_WALL, 5, 20);
        FIRE.add(ModBlocks.BAMBOO_WALL, 5, 20);
        FIRE.add(ModBlocks.BIRCH_WALL, 5, 20);
        FIRE.add(ModBlocks.MANGROVE_WALL, 5, 20);
        FIRE.add(ModBlocks.CRIMSON_WALL, 5, 0);
        FIRE.add(ModBlocks.WARPED_WALL, 5, 0);
        //Alt Spruce--------------------------------------------------------------------------------------------------\\
        FIRE.add(ModBlocks.ALT_SPRUCE_PLANK, 5, 20);
        FIRE.add(ModBlocks.ALT_SPRUCE_STAIRS, 5, 20);
        FIRE.add(ModBlocks.ALT_SPRUCE_SLAB, 5, 20);
        FIRE.add(ModBlocks.ALT_SPRUCE_DOOR, 5, 20);
        FIRE.add(ModBlocks.ALT_SPRUCE_WALL, 5, 20);
        FIRE.add(ModBlocks.ALT_SPRUCE_TRAPDOOR, 5, 20);
        //Alt Oak-----------------------------------------------------------------------------------------------------\\
        FIRE.add(ModBlocks.ALT_OAK_PLANK, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_STAIRS, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_SLAB, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_BUTTON, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_PRESSURE_PLATE, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_DOOR, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_TRAPDOOR, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_FENCE, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_FENCE_GATE, 5, 20);
        FIRE.add(ModBlocks.ALT_OAK_WALL, 5, 20);
    }

}
