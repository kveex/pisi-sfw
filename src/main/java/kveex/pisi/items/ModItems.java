package kveex.pisi.items;

import kveex.pisi.Pisi;
import kveex.pisi.items.custom.rings.Ring;
import kveex.pisi.items.custom.rings.RingWithAmethyst;
import kveex.pisi.items.custom.rings.RingWithDiamond;
import kveex.pisi.items.custom.rings.RingWithEmerald;
import kveex.pisi.utils.FoodCompnents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Registring Items------------------------------------------------------------------------------------------------//
    //Items
    public static final Item BUNDLE_OF_SEEDS = registerItems("bundle_of_seeds", new Item(new FabricItemSettings().maxCount(16)));
    //Rings
    public static final Item RING = registerItems("ring", new Ring(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_DIAMOND = registerItems("ring_with_diamond", new RingWithDiamond(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_AMETHYST = registerItems("ring_with_amethyst", new RingWithAmethyst(new FabricItemSettings().maxCount(1)));
    public static final Item RING_WITH_EMERALD = registerItems("ring_with_emerald", new RingWithEmerald(new FabricItemSettings().maxCount(1)));
    //Food
    public static final Item WARM_STICK = registerItems("warm_stick", new Item(new FabricItemSettings().maxCount(64).food(FoodCompnents.WARM_STICK)));

    //----------------------------------------------------------------------------------------------------------------//
    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pisi.MOD_ID, id), item);
    }
    public static void registerModItems() {
        Pisi.LOGGER.info("PisiItems");
    }
}
