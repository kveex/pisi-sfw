package kveex.pisi;

import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
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

        ModItemGroups.registerGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModTrades.registerModTrades();
    }
}
