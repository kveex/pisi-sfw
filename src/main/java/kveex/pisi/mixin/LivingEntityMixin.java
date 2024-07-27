package kveex.pisi.mixin;

import kveex.pisi.items.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.GlobalPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*The goal of this Mixin class is to give the totems the same ability to save the player from death, along with
some unique custom features*/

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity{


    @Shadow
    public  native ItemStack getStackInHand(Hand hand_1);

    @Shadow
    public native boolean hasStatusEffect(StatusEffect effect);

    @Shadow public native void setHealth(float health);

    @Shadow public native boolean clearStatusEffects();

    @Shadow public native boolean addStatusEffect(StatusEffectInstance statusEffectInstance_1);

    @Shadow public native EntityGroup getGroup();

    @Shadow public abstract boolean teleport(double x, double y, double z, boolean particleEffects);

    public MinecraftServer server = getServer();
    GlobalPos globalPos = this.getEntityWorld().getDimension().natural() ? GlobalPos.create(getEntityWorld().getRegistryKey(), getEntityWorld().getSpawnPos()) : null;
//    public double SpawnPosX = this.getEntityWorld().getSpawnPos().getX();
//    public double SpawnPosY = this.getEntityWorld().getSpawnPos().getX();
//    public double SpawnPosZ = this.getEntityWorld().getSpawnPos().getX();

    protected LivingEntityMixin(EntityType<?> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @Inject(at = @At("HEAD"), method = "tryUseTotem", cancellable = true)
    public void useTeleportingTotem(DamageSource damageSource_1, CallbackInfoReturnable<Boolean> callback) {

        /*inits PlayerEntity entity, which is a copy of this casted to Living Entity and then PlayerEntity*/
        LivingEntity entity = (LivingEntity)(Object)this;

        /*ItemStack object that is set to the offhand item that entity is carrying*/
        ItemStack offhand_stack = entity.getStackInHand(Hand.OFF_HAND);
        ItemStack mainhand_stack = entity.getStackInHand(Hand.MAIN_HAND);

        //Executes if the item in offhand_stack is equal to the explosive totem of Undying
        if ((offhand_stack.getItem() == ModItems.TOTEM_OF_HELPLESSNESS) || (mainhand_stack.getItem() == ModItems.TOTEM_OF_HELPLESSNESS)) {

            /*sets copy to offhand_stack*/

            if((offhand_stack.getItem() == ModItems.TOTEM_OF_HELPLESSNESS)) {
                offhand_stack.decrement(1);
            }
            else {

                mainhand_stack.decrement(1);

            }
            /*totem saves player from an untimely death*/
            this.setHealth(1.0F);
            this.extinguish();
            this.fallDistance = 0f;
            this.clearStatusEffects();
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 17500, 4));
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1));

            this.getEntityWorld().getSpawnPos();
//            System.out.println("x: " + SpawnPosX + " y: " + SpawnPosY + " z: " + SpawnPosZ);
            this.teleport(globalPos.getPos().getX(), globalPos.getPos().getY(), globalPos.getPos().getZ());
            this.getWorld().sendEntityStatus(this, (byte) 35);
            callback.setReturnValue(true);
        }

    }
}


