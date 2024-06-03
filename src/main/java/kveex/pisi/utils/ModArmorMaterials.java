package kveex.pisi.utils;

import kveex.pisi.Pisi;
import kveex.pisi.items.ModItems;
import kveex.pisi.sounds.ModSounds;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    SHINY("shiny", 10, new int[] { 5, 10, 8, 5 }, 19,
            ModSounds.Shiny_Armor_Equip, 3.5f, 0.5f, () -> Ingredient.ofItems(ModItems.SHINY_INGOT)),
    AMETHYST_GOLDEN("amethyst_golden", 3, new int[] { 3, 6, 4, 2 }, 15,
            ModSounds.Amethyst_Golden_Armor_Equip, 0f, 0f, () -> Ingredient.ofItems(Items.GOLD_INGOT, Items.AMETHYST_SHARD)),
    AMETHYST_DIAMOND("amethyst_diamond", 4, new int[] { 4, 9, 7, 4 }, 15,
            ModSounds.Amethyst_Diamond_Armor_Equip, 2.2f, 0f, () -> Ingredient.ofItems(Items.DIAMOND, Items.AMETHYST_SHARD)),
    AMETHYST_NETHERITE("amethyst_netherite", 5, new int[] { 4, 9, 7, 4 }, 10,
            ModSounds.Amethyst_Netherite_Armor_Equip, 3.2f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT, Items.AMETHYST_SHARD));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmount;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResisrance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {141, 191, 181, 151};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmount, int enchantability, SoundEvent equipSound, float toughness, float knockbackResisrance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmount = protectionAmount;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResisrance = knockbackResisrance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmount[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Pisi.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResisrance;
    }
}
