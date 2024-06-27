package kveex.pisi.sounds;

import kveex.pisi.Pisi;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    //SoundEvents-----------------------------------------------------------------------------------------------------//
    //Discs
    public static final SoundEvent CatQuest = registerSoundEvent("cat_quest");
    public static final SoundEvent Berb = registerSoundEvent("berb");
    public static final SoundEvent WWR = registerSoundEvent("war_without_reason");
    //Armor
    public static final SoundEvent Amethyst_Golden_Armor_Equip = registerSoundEvent("amethyst_golden_armor_equip");
    public static final SoundEvent Amethyst_Diamond_Armor_Equip = registerSoundEvent("amethyst_diamond_armor_equip");
    public static final SoundEvent Amethyst_Netherite_Armor_Equip = registerSoundEvent("amethyst_netherite_armor_equip");
    public static final SoundEvent Shiny_Armor_Equip = registerSoundEvent("shiny_armor_equip");
    //Blocks
    public static final SoundEvent SlimedGlowStoneBreak = registerSoundEvent("slimed_glowstone_dust_break");
    public static final SoundEvent SlimedGlowStoneStep = registerSoundEvent("slimed_glowstone_dust_step");
    public static final SoundEvent SlimedGlowStonePlace = registerSoundEvent("slimed_glowstone_dust_place");
    public static final SoundEvent SlimedGlowStoneHit = registerSoundEvent("slimed_glowstone_dust_hit");
    public static final SoundEvent SlimedGlowStoneFall = registerSoundEvent("slimed_glowstone_dust_fall");

    public static final SoundEvent STEEL_BLOCK_BREAK = registerSoundEvent("steel_block_break");
    public static final SoundEvent STEEL_BLOCK_STEP = registerSoundEvent("steel_block_step");
    public static final SoundEvent STEEL_BLOCK_PLACE = registerSoundEvent("steel_block_place");
    public static final SoundEvent STEEL_BLOCK_HIT = registerSoundEvent("steel_block_hit");
    public static final SoundEvent STEEL_BLOCK_FALL = registerSoundEvent("steel_block_fall");

    public static final BlockSoundGroup STEEL_BLOCK = new BlockSoundGroup(1f, 1f,
            ModSounds.STEEL_BLOCK_BREAK,
            ModSounds.STEEL_BLOCK_STEP,
            ModSounds.STEEL_BLOCK_PLACE,
            ModSounds.STEEL_BLOCK_HIT,
            ModSounds.STEEL_BLOCK_FALL
    );

    public static final BlockSoundGroup SlimedGlowStoneBlock = new BlockSoundGroup(1f, 1f,
            ModSounds.SlimedGlowStoneBreak,
            ModSounds.SlimedGlowStoneStep,
            ModSounds.SlimedGlowStonePlace,
            ModSounds.SlimedGlowStoneHit,
            ModSounds.SlimedGlowStoneFall
    );
    //----------------------------------------------------------------------------------------------------------------//
    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Pisi.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        Pisi.LOGGER.info("PisiSounds");
    }
}
