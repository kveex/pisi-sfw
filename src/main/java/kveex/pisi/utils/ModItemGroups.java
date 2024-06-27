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
                        //Blocks
                        entries.add(ModBlocks.GUNPOWDER_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_SEEDS);
                        entries.add(ModBlocks.SLIMED_GLOWSTONE_DUST);
                        //Deepslate pots
                        entries.add(ModBlocks.DEEPSLATE_POT_N);
                        entries.add(ModBlocks.DEEPSLATE_POT_B);
                        entries.add(ModBlocks.DEEPSLATE_POT_T);
                        entries.add(ModBlocks.DEEPSLATE_POT_TE);
                        entries.add(ModBlocks.DEEPSLATE_POT_TS);
                        //Lava Lamps
                        entries.add(ModBlocks.LAVA_LAMP);
                        entries.add(ModBlocks.LAVA_LAMP_RED);
                        entries.add(ModBlocks.LAVA_LAMP_BLUE);
                        entries.add(ModBlocks.LAVA_LAMP_YELLOW);
                        entries.add(ModBlocks.LAVA_LAMP_LIME);
                        entries.add(ModBlocks.LAVA_LAMP_PINK);
                        entries.add(ModBlocks.LAVA_LAMP_PURPLE);
                        //Walls
                        entries.add(ModBlocks.OAK_WALL);
                        entries.add(ModBlocks.SPRUCE_WALL);
                        entries.add(ModBlocks.BIRCH_WALL);
                        entries.add(ModBlocks.JUNGLE_WALL);
                        entries.add(ModBlocks.ACACIA_WALL);
                        entries.add(ModBlocks.DARK_OAK_WALL);
                        entries.add(ModBlocks.MANGROVE_WALL);
                        entries.add(ModBlocks.CHERRY_WALL);
                        entries.add(ModBlocks.BAMBOO_WALL);
                        entries.add(ModBlocks.CRIMSON_WALL);
                        entries.add(ModBlocks.WARPED_WALL);
                        //Alt Oak
                        entries.add(ModBlocks.ALT_OAK_PLANK);
                        entries.add(ModBlocks.ALT_OAK_STAIRS);
                        entries.add(ModBlocks.ALT_OAK_SLAB);
                        entries.add(ModBlocks.ALT_OAK_WALL);
                        entries.add(ModBlocks.ALT_OAK_FENCE);
                        entries.add(ModBlocks.ALT_OAK_FENCE_GATE);
                        entries.add(ModBlocks.ALT_OAK_DOOR);
                        entries.add(ModBlocks.ALT_OAK_TRAPDOOR);
                        entries.add(ModBlocks.ALT_OAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.ALT_OAK_BUTTON);
                        //Alt Spruce
                        entries.add(ModBlocks.ALT_SPRUCE_PLANK);
                        entries.add(ModBlocks.ALT_SPRUCE_STAIRS);
                        entries.add(ModBlocks.ALT_SPRUCE_SLAB);
                        entries.add(ModBlocks.ALT_SPRUCE_WALL);
                        entries.add(ModBlocks.ALT_SPRUCE_DOOR);
                        entries.add(ModBlocks.ALT_SPRUCE_TRAPDOOR);
                    }))
                    .build());
    public static final ItemGroup PISI_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(Pisi.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BUNDLE_OF_SEEDS))
                    .displayName(Text.translatable("itemgroup.pisi.items"))
                    .entries(((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.AMETHYST_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.BUNDLE_OF_SEEDS);
                        entries.add(ModItems.WARM_STICK);
                        entries.add(ModItems.BERB_DISC_FRAGMENT);
                        entries.add(ModItems.STEEL_INGOT);
                        //Discs
                        entries.add(ModItems.BERB_DISC);
                        entries.add(ModItems.CAT_QUEST_DISC);
                        entries.add(ModItems.WAR_WITHOUT_REASON_DISC);
                        //Rings
                        entries.add(ModItems.RING);
                        entries.add(ModItems.RING_WITH_DIAMOND);
                        entries.add(ModItems.RING_WITH_AMETHYST);
                        entries.add(ModItems.RING_WITH_EMERALD);
                        //Amethyst golden tools
                        entries.add(ModItems.AMETHYST_GOLDEN_PICKAXE);
                        entries.add(ModItems.AMETHYST_GOLDEN_AXE);
                        entries.add(ModItems.AMETHYST_GOLDEN_SWORD);
                        entries.add(ModItems.AMETHYST_GOLDEN_SPIKED_SWORD);
                        entries.add(ModItems.AMETHYST_GOLDEN_HOE);
                        entries.add(ModItems.AMETHYST_GOLDEN_SHOVEL);
                        //Amethyst golden armor
                        entries.add(ModItems.AMETHYST_GOLDEN_HELMET);
                        entries.add(ModItems.AMETHYST_GOLDEN_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_GOLDEN_LEGGINGS);
                        entries.add(ModItems.AMETHYST_GOLDEN_BOOTS);
                        //Amethyst diamond tools
                        entries.add(ModItems.AMETHYST_DIAMOND_PICKAXE);
                        entries.add(ModItems.AMETHYST_DIAMOND_AXE);
                        entries.add(ModItems.AMETHYST_DIAMOND_SWORD);
                        entries.add(ModItems.AMETHYST_DIAMOND_SPIKED_SWORD);
                        entries.add(ModItems.AMETHYST_DIAMOND_HOE);
                        entries.add(ModItems.AMETHYST_DIAMOND_SHOVEL);
                        //Amethyst diamond armor
                        entries.add(ModItems.AMETHYST_DIAMOND_HELMET);
                        entries.add(ModItems.AMETHYST_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_DIAMOND_LEGGINGS);
                        entries.add(ModItems.AMETHYST_DIAMOND_BOOTS);
                        //Amethyst netherite tools
                        entries.add(ModItems.AMETHYST_NETHERITE_PICKAXE);
                        entries.add(ModItems.AMETHYST_NETHERITE_AXE);
                        entries.add(ModItems.AMETHYST_NETHERITE_SWORD);
                        entries.add(ModItems.AMETHYST_NETHERITE_SPIKED_SWORD);
                        entries.add(ModItems.AMETHYST_NETHERITE_HOE);
                        entries.add(ModItems.AMETHYST_NETHERITE_SHOVEL);
                        //Amethyst netherite armor
                        entries.add(ModItems.AMETHYST_NETHERITE_HELMET);
                        entries.add(ModItems.AMETHYST_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_NETHERITE_LEGGINGS);
                        entries.add(ModItems.AMETHYST_NETHERITE_BOOTS);
                        //Shiny
                        entries.add(ModItems.ROTTING_ORE);
                        entries.add(ModItems.SHINY_ORE);
                        entries.add(ModItems.SHINY_ORES);
                        entries.add(ModItems.SHINY_INGOT);
                        //Shiny armor
                        entries.add(ModItems.SHINY_HELMET);
                        entries.add(ModItems.SHINY_CHESTPLATE);
                        entries.add(ModItems.SHINY_LEGGINGS);
                        entries.add(ModItems.SHINY_BOOTS);
                    }))
                    .build());
    public static void registerGroups() {
        Pisi.LOGGER.info("PisiGroups");
    }
}
