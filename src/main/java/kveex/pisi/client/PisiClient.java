package kveex.pisi.client;

import kveex.pisi.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PisiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //DeepslatePots transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPSLATE_POT_TS, RenderLayer.getCutout());
        //SlimedGlowStoneBlock transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SLIMED_GLOWSTONE_DUST, RenderLayer.getCutout());
        //All lava lamps transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_RED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_YELLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_LIME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_PINK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVA_LAMP_PURPLE, RenderLayer.getCutout());
        //All trapdoor transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALT_SPRUCE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_TRAPDOOR, RenderLayer.getCutout());
    }
}
