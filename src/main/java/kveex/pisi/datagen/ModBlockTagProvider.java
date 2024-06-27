package kveex.pisi.datagen;

import kveex.pisi.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STEEL_BLOCK_FULL)
                .add(ModBlocks.STEEL_BLOCK_MID)
                .add(ModBlocks.STEEL_BLOCK_MIN)
                .add(ModBlocks.STEEL_STAIRS)
                .add(ModBlocks.STEEL_SLAB)
                .add(ModBlocks.STEEL_TRAPDOOR);
        }
    }
