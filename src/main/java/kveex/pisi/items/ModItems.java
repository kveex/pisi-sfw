package kveex.pisi.items;

import kveex.pisi.Pisi;
import kveex.pisi.items.custom.rings.Ring;
import kveex.pisi.items.custom.rings.RingWithAmethyst;
import kveex.pisi.items.custom.rings.RingWithDiamond;
import kveex.pisi.items.custom.rings.RingWithEmerald;
import kveex.pisi.sounds.ModSounds;
import kveex.pisi.utils.FoodCompnents;
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
    //Tools-----------------------------------------------------------------------------------------------------------\\
    public static final Item AMETHYST_GOLD_PICKAXE = registerItems("amethyst_golden_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST_GOLD, 3, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLD_AXE = registerItems("amethyst_golden_axe", new AxeItem(ModToolMaterials.AMETHYST_GOLD, 7.5f, -2.7f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLD_SWORD = registerItems("amethyst_golden_sword", new SwordItem(ModToolMaterials.AMETHYST_GOLD, 3, -2.2f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLD_SPIKED_SWORD = registerItems("amethyst_golden_spiked_sword", new SwordItem(ModToolMaterials.AMETHYST_GOLD, 5, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLD_HOE = registerItems("amethyst_golden_hoe", new HoeItem(ModToolMaterials.AMETHYST_GOLD, 0, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_GOLD_SHOVEL = registerItems("amethyst_golden_shovel", new ShovelItem(ModToolMaterials.AMETHYST_GOLD, 1.5f, -3.0f, new FabricItemSettings()));
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
    private static void addItemsToCombat(FabricItemGroupEntries entries) {         //Adding items to combat creative tab
        //AMETHYST GOLD
        entries.addAfter(Items.GOLDEN_SWORD, ModItems.AMETHYST_GOLD_SWORD);
        entries.addAfter(ModItems.AMETHYST_GOLD_SWORD, ModItems.AMETHYST_GOLD_SPIKED_SWORD);
        //AMETHYST DIAMOND
        entries.addAfter(Items.DIAMOND_SWORD, ModItems.AMETHYST_DIAMOND_SWORD);
        entries.addAfter(ModItems.AMETHYST_DIAMOND_SWORD, ModItems.AMETHYST_DIAMOND_SPIKED_SWORD);
        //AMETHYST NETHERITE
        entries.addAfter(Items.NETHERITE_SWORD, ModItems.AMETHYST_NETHERITE_SWORD);
        entries.addAfter(ModItems.AMETHYST_NETHERITE_SWORD, ModItems.AMETHYST_NETHERITE_SPIKED_SWORD);
    }
    //----------------------------------------------------------------------------------------------------------------\\
    private static void addItemsToTools(FabricItemGroupEntries entries) {         //Adding items to tools creative tab
        //AMETHYST GOLD
        entries.addAfter(Items.GOLDEN_HOE, ModItems.AMETHYST_GOLD_SHOVEL);
        entries.addAfter(ModItems.AMETHYST_GOLD_SHOVEL, ModItems.AMETHYST_GOLD_PICKAXE);
        entries.addAfter(ModItems.AMETHYST_GOLD_PICKAXE, ModItems.AMETHYST_GOLD_AXE);
        entries.addAfter(ModItems.AMETHYST_GOLD_AXE, ModItems.AMETHYST_GOLD_HOE);
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToTools);
    }
}
