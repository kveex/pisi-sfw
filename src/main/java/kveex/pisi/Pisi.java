package kveex.pisi;

import kveex.pisi.blocks.ModBlockEntities;
import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
import kveex.pisi.sounds.ModSounds;
import kveex.pisi.utils.FlammableBlocks;
import kveex.pisi.utils.ModItemGroups;
import kveex.pisi.utils.ModTrades;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pisi implements ModInitializer {
    public static final String MOD_ID = "pisi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("PISI");

        ModSounds.registerSounds();
        ModItemGroups.registerGroups();
        ModBlockEntities.registerBlockEntities();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModTrades.registerModTrades();
        FlammableBlocks.registerFire();
    }
}
