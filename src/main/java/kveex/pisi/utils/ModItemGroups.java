package kveex.pisi.utils;

import kveex.pisi.Pisi;
import kveex.pisi.blocks.ModBlocks;
import kveex.pisi.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PISI_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(Pisi.MOD_ID, "blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.GUNPOWDER_BLOCK))
                    .displayName(Text.translatable("itemgroup.pisi.blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.GUNPOWDER_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_SEEDS);
                    }))
                    .build());
    public static final ItemGroup PISI_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(Pisi.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BUNDLE_OF_SEEDS))
                    .displayName(Text.translatable("itemgroup.pisi.items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.BUNDLE_OF_SEEDS);
                        entries.add(ModItems.WARM_STICK);
                        entries.add(ModItems.RING);
                        entries.add(ModItems.RING_WITH_DIAMOND);
                        entries.add(ModItems.RING_WITH_AMETHYST);
                        entries.add(ModItems.RING_WITH_EMERALD);
                    }))
                    .build());
    public static void registerGroups() {
        Pisi.LOGGER.info("PisiGroups");
    }
}
