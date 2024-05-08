package kveex.pisi.items.custom.rings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Ring extends Item {
    public Ring(Settings settings) {
        super(settings);
    }

    @Override                                                                                             //Just tooltip
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.pisi.ring").formatted(Formatting.GOLD));
        tooltip.add(Text.empty());
    }
}
