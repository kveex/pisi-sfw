package kveex.pisi.datagen;

import kveex.pisi.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STEEL_BLOCK_FULL);
        addDrop(ModBlocks.STEEL_BLOCK_MID);
        addDrop(ModBlocks.STEEL_BLOCK_MIN);
        addDrop(ModBlocks.STEEL_STAIRS);
        addDrop(ModBlocks.STEEL_SLAB, slabDrops(ModBlocks.STEEL_SLAB));
        addDrop(ModBlocks.STEEL_TRAPDOOR);
    }
}
