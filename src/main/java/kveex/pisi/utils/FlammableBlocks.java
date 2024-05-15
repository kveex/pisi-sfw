package kveex.pisi.utils;

import kveex.pisi.blocks.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammableBlocks {
    public static void registerFire() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WALL, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_WALL, 5, 0);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_WALL, 5, 0);
    }

}
