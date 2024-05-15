package kveex.pisi.client;

import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.blocks.custom.SlimedGlowStoneBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PisiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //SlimedGlowStoneBlock transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SLIMED_GLOWSTONE_DUST, RenderLayer.getCutout());
        //Alt oak door and trapdoor transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_OAK_TRAPDOOR, RenderLayer.getCutout());
        //Alt spruce door transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_SPRUCE_DOOR, RenderLayer.getCutout());
    }
}
