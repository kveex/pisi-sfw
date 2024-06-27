package kveex.pisi.items;

import kveex.pisi.Pisi;
import kveex.pisi.items.custom.FunnyIngotItem;
import kveex.pisi.items.custom.ModArmorItem;
import kveex.pisi.items.custom.rings.Ring;
import kveex.pisi.items.custom.rings.RingWithAmethyst;
import kveex.pisi.items.custom.rings.RingWithDiamond;
import kveex.pisi.items.custom.rings.RingWithEmerald;
import kveex.pisi.sounds.ModSounds;
import kveex.pisi.utils.FoodCompnents;
import kveex.pisi.utils.ModArmorMaterials;
import kveex.pisi.utils.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Registering Items------------------------------------------------------------------------------------------------\\
    public static final Item BUNDLE_OF_SEEDS = registerItems("bundle_of_seeds", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item BERB_DISC_FRAGMENT = registerItems("disc_fragment_berb", new Item(new FabricItemSettings().maxCount(8)));
    public static final Item AMETHYST_UPGRADE_SMITHING_TEMPLATE = registerItems("amethyst_upgrade_smithing_template", new Item(new FabricItemSettings()));
    //Steel Items-----------------------------------------------------------------------------------------------------\\
    public static final Item STEEL_INGOT = registerItems("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item FUNNY_INGOT = registerItems("funny_ingot", new FunnyIngotItem(new FabricItemSettings()));
    //Shiny Items-----------------------------------------------------------------------------------------------------------\\
    public static final Item ROTTING_ORE = registerItems("rotting_ore", new Item(new FabricItemSettings()));
    public static final Item SHINY_ORE = registerItems("shiny_ore", new Item(new FabricItemSettings()));
    public static final Item SHINY_ORES = registerItems("shiny_ores", new Item(new FabricItemSettings()));
    public static final Item SHINY_INGOT = registerItems("shiny_ingot", new Item(new FabricItemSettings()));
    //Tools-----------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_GOLDEN_PICKAXE = registerItems("amethyst_golden_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST_GOLD, 3, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_AXE = registerItems("amethyst_golden_axe", new AxeItem(ModToolMaterials.AMETHYST_GOLD, 7.5f, -2.7f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_SWORD = registerItems("amethyst_golden_sword", new SwordItem(ModToolMaterials.AMETHYST_GOLD, 3, -2.2f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_SPIKED_SWORD = registerItems("amethyst_golden_spiked_sword", new SwordItem(ModToolMaterials.AMETHYST_GOLD, 5, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_HOE = registerItems("amethyst_golden_hoe", new HoeItem(ModToolMaterials.AMETHYST_GOLD, 0, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_SHOVEL = registerItems("amethyst_golden_shovel", new ShovelItem(ModToolMaterials.AMETHYST_GOLD, 1.5f, -3.0f, new FabricItemSettings()));
    //----------------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_DIAMOND_PICKAXE = registerItems("amethyst_diamond_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST_DIAMOND,2,-2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_AXE = registerItems("amethyst_diamond_axe", new AxeItem(ModToolMaterials.AMETHYST_DIAMOND,5.0f,-2.5f, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_SWORD = registerItems("amethyst_diamond_sword", new SwordItem(ModToolMaterials.AMETHYST_DIAMOND,4,-2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_SPIKED_SWORD = registerItems("amethyst_diamond_spiked_sword", new SwordItem(ModToolMaterials.AMETHYST_DIAMOND,6,-3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_HOE = registerItems("amethyst_diamond_hoe", new HoeItem(ModToolMaterials.AMETHYST_DIAMOND,-3,-2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_SHOVEL = registerItems("amethyst_diamond_shovel", new ShovelItem(ModToolMaterials.AMETHYST_DIAMOND,2.5f,-3.0f, new FabricItemSettings()));
    //----------------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_NETHERITE_PICKAXE = registerItems("amethyst_netherite_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST_NETHERITE, 1, -2.5f, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_AXE = registerItems("amethyst_netherite_axe", new AxeItem(ModToolMaterials.AMETHYST_NETHERITE, 4.0f, -2.7f, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_SWORD = registerItems("amethyst_netherite_sword", new SwordItem(ModToolMaterials.AMETHYST_NETHERITE, 4, -2.1f, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_SPIKED_SWORD = registerItems("amethyst_netherite_spiked_sword", new SwordItem(ModToolMaterials.AMETHYST_NETHERITE, 6, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_HOE = registerItems("amethyst_netherite_hoe", new HoeItem(ModToolMaterials.AMETHYST_NETHERITE, -4, 0.0f, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_SHOVEL = registerItems("amethyst_netherite_shovel", new ShovelItem(ModToolMaterials.AMETHYST_NETHERITE, 2.0f, -2.7f, new FabricItemSettings()));
    //Armor-----------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_GOLDEN_HELMET = registerItems("amethyst_golden_helmet", new ArmorItem(ModArmorMaterials.AMETHYST_GOLDEN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_CHESTPLATE = registerItems("amethyst_golden_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST_GOLDEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_LEGGINGS = registerItems("amethyst_golden_leggings", new ArmorItem(ModArmorMaterials.AMETHYST_GOLDEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_GOLDEN_BOOTS = registerItems("amethyst_golden_boots", new ArmorItem(ModArmorMaterials.AMETHYST_GOLDEN, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //----------------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_DIAMOND_HELMET = registerItems("amethyst_diamond_helmet", new ArmorItem(ModArmorMaterials.AMETHYST_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_CHESTPLATE = registerItems("amethyst_diamond_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_LEGGINGS = registerItems("amethyst_diamond_leggings", new ArmorItem(ModArmorMaterials.AMETHYST_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_DIAMOND_BOOTS = registerItems("amethyst_diamond_boots", new ArmorItem(ModArmorMaterials.AMETHYST_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //----------------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_NETHERITE_HELMET = registerItems("amethyst_netherite_helmet", new ArmorItem(ModArmorMaterials.AMETHYST_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_CHESTPLATE = registerItems("amethyst_netherite_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_LEGGINGS = registerItems("amethyst_netherite_leggings", new ArmorItem(ModArmorMaterials.AMETHYST_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_NETHERITE_BOOTS = registerItems("amethyst_netherite_boots", new ArmorItem(ModArmorMaterials.AMETHYST_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //----------------------------------------------------------------------------------------------------------------\\
    public static final Item SHINY_HELMET = registerItems("shiny_helmet", new ModArmorItem(ModArmorMaterials.SHINY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SHINY_CHESTPLATE = registerItems("shiny_chestplate", new ArmorItem(ModArmorMaterials.SHINY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SHINY_LEGGINGS = registerItems("shiny_leggings", new ArmorItem(ModArmorMaterials.SHINY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SHINY_BOOTS = registerItems("shiny_boots", new ArmorItem(ModArmorMaterials.SHINY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //Discs-----------------------------------------------------------------------------------------------------------\\
    public static final Item BERB_DISC = registerItems("berb_disc", new MusicDiscItem(9, ModSounds.Berb, new FabricItemSettings().maxCount(1), 42));
    public static final Item CAT_QUEST_DISC = registerItems("cat_quest_disc", new MusicDiscItem(3, ModSounds.CatQuest, new FabricItemSettings().maxCount(1), 172));
    public static final Item WAR_WITHOUT_REASON_DISC = registerItems("war_without_reason_disc", new MusicDiscItem(15, ModSounds.WWR, new FabricItemSettings().maxCount(1), 408));
    //Rings-----------------------------------------------------------------------------------------------------------\\
    public static final Item RING = registerItems("ring", new Ring(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_DIAMOND = registerItems("ring_with_diamond", new RingWithDiamond(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_AMETHYST = registerItems("ring_with_amethyst", new RingWithAmethyst(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_EMERALD = registerItems("ring_with_emerald", new RingWithEmerald(new FabricItemSettings().maxCount(1)));
    //Food------------------------------------------------------------------------------------------------------------\\
    public static final Item WARM_STICK = registerItems("warm_stick", new Item(new FabricItemSettings().maxCount(64).food(FoodCompnents.WARM_STICK)));
    //----------------------------------------------------------------------------------------------------------------\\
    private static void addItemsToIngredients(FabricItemGroupEntries entries) {   //Adding items to ingredient creative tab
        entries.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.AMETHYST_UPGRADE_SMITHING_TEMPLATE);
        entries.addAfter(Items.RAW_GOLD, ModItems.ROTTING_ORE);
        entries.addAfter(ModItems.ROTTING_ORE, ModItems.SHINY_ORE);
        entries.addAfter(ModItems.SHINY_ORE, ModItems.SHINY_ORES);
        entries.addAfter(Items.NETHERITE_INGOT, ModItems.SHINY_INGOT);
    }
    private static void addItemsToCombat(FabricItemGroupEntries entries) {        //Adding items to combat creative tab
        //AMETHYST GOLD
        entries.addAfter(Items.GOLDEN_SWORD, ModItems.AMETHYST_GOLDEN_SWORD);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_SWORD, ModItems.AMETHYST_GOLDEN_SPIKED_SWORD);

        entries.addAfter(Items.GOLDEN_BOOTS, ModItems.AMETHYST_GOLDEN_HELMET);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_HELMET, ModItems.AMETHYST_GOLDEN_CHESTPLATE);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_CHESTPLATE, ModItems.AMETHYST_GOLDEN_LEGGINGS);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_LEGGINGS, ModItems.AMETHYST_GOLDEN_BOOTS);
        //AMETHYST DIAMOND
        entries.addAfter(Items.DIAMOND_SWORD, ModItems.AMETHYST_DIAMOND_SWORD);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_SWORD, ModItems.AMETHYST_DIAMOND_SPIKED_SWORD);

        entries.addAfter(Items.DIAMOND_BOOTS, ModItems.AMETHYST_DIAMOND_HELMET);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_HELMET, ModItems.AMETHYST_DIAMOND_CHESTPLATE);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_CHESTPLATE, ModItems.AMETHYST_DIAMOND_LEGGINGS);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_LEGGINGS, ModItems.AMETHYST_DIAMOND_BOOTS);
        //AMETHYST NETHERITE
        entries.addAfter(Items.NETHERITE_SWORD, ModItems.AMETHYST_NETHERITE_SWORD);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_SWORD, ModItems.AMETHYST_NETHERITE_SPIKED_SWORD);

        entries.addAfter(Items.NETHERITE_BOOTS, ModItems.AMETHYST_NETHERITE_HELMET);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_HELMET, ModItems.AMETHYST_NETHERITE_CHESTPLATE);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_CHESTPLATE, ModItems.AMETHYST_NETHERITE_LEGGINGS);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_LEGGINGS, ModItems.AMETHYST_NETHERITE_BOOTS);
        //SHINY
        entries.addAfter(ModItems.AMETHYST_NETHERITE_BOOTS, ModItems.SHINY_HELMET);
        entries.addAfter(ModItems.SHINY_HELMET, ModItems.SHINY_CHESTPLATE);
        entries.addAfter(ModItems.SHINY_CHESTPLATE, ModItems.SHINY_LEGGINGS);
        entries.addAfter(ModItems.SHINY_LEGGINGS, ModItems.SHINY_BOOTS);
    }
    //----------------------------------------------------------------------------------------------------------------\\
    private static void addItemsToTools(FabricItemGroupEntries entries) {         //Adding items to tools creative tab
        //AMETHYST GOLD
        entries.addAfter(Items.GOLDEN_HOE, ModItems.AMETHYST_GOLDEN_SHOVEL);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_SHOVEL, ModItems.AMETHYST_GOLDEN_PICKAXE);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_PICKAXE, ModItems.AMETHYST_GOLDEN_AXE);
        entries.addAfter(ModItems.AMETHYST_GOLDEN_AXE, ModItems.AMETHYST_GOLDEN_HOE);
        //AMETHYST DIAMOND
        entries.addAfter(Items.DIAMOND_HOE, ModItems.AMETHYST_DIAMOND_SHOVEL);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_SHOVEL, ModItems.AMETHYST_DIAMOND_PICKAXE);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_PICKAXE, ModItems.AMETHYST_DIAMOND_AXE);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_AXE, ModItems.AMETHYST_DIAMOND_HOE);
        //AMETHYST NETHERITE
        entries.addAfter(Items.NETHERITE_HOE, ModItems.AMETHYST_NETHERITE_SHOVEL);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_SHOVEL, ModItems.AMETHYST_NETHERITE_PICKAXE);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_PICKAXE, ModItems.AMETHYST_NETHERITE_AXE);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_AXE, ModItems.AMETHYST_NETHERITE_HOE);
    }
    //----------------------------------------------------------------------------------------------------------------\\
    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pisi.MOD_ID, id), item);
    }

    public static void registerModItems() {
        Pisi.LOGGER.info("PisiItems");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToTools);
    }
}
