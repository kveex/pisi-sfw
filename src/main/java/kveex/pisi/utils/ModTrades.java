package kveex.pisi.utils;

import kveex.pisi.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerModTrades() {                                          //Farmer trade for bundle of seeds
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.BUNDLE_OF_SEEDS, 4),
                        new ItemStack(Items.EMERALD, 2),
                        6,5, 0.05f)
                    ));
                }
        );
    }
}
