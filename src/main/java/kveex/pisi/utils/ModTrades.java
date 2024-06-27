package kveex.pisi.utils;

import kveex.pisi.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerModTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, //Farmer trade for bundle of seeds
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.BUNDLE_OF_SEEDS, 4),
                        new ItemStack(Items.EMERALD, 2),
                        6,5, 0.05f)
                    ));
                }
        );
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3, //Farmer trade for disc
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.CAT_QUEST_DISC, 1),
                            6,5, 0.05f)
                    ));
                }
        );
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, //Weaponsmith trade for bundle of seeds
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.FUNNY_INGOT, 1),
                            6,5, 0.05f)
                    ));
                }
        );
    }
}
