package kveex.pisi.utils;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodCompnents {
    public static final FoodComponent WARM_STICK = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 9), 0.11f).alwaysEdible().build();
    public static final FoodComponent PIPIN = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 1200, 9), 1.0f).alwaysEdible().build();

}
