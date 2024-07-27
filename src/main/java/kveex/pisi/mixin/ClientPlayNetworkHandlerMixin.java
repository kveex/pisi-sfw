package kveex.pisi.mixin;

import kveex.pisi.items.ModItems;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    private static boolean isMyTotem(ItemStack itemStack){
        return itemStack.isOf(ModItems.TOTEM_OF_HELPLESSNESS);
    }


    @Inject(method = "getActiveTotemOfUndying", at = @At(value = "RETURN"), cancellable = true)
    private static void getActiveMoreTotemOfUndying(PlayerEntity player, CallbackInfoReturnable<ItemStack> cir){
        for(Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if(isMyTotem(itemStack)) {
                cir.setReturnValue(itemStack);
            }
        }
    }
}
