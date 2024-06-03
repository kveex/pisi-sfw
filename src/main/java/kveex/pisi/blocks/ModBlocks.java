package kveex.pisi.blocks;

import kveex.pisi.Pisi;
import kveex.pisi.blocks.custom.GunpowderBlock;
import kveex.pisi.blocks.custom.LavaLamp;
import kveex.pisi.blocks.custom.SeedsBlock;
import kveex.pisi.blocks.custom.SlimedGlowStoneBlock;
import kveex.pisi.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static final float WOOD = 2.0f;
    //Registering blocks----------------------------------------------------------------------------------------------\\
    public static final Block GUNPOWDER_BLOCK = registerBlocks("gunpowder_block",
            new GunpowderBlock(FabricBlockSettings.create()
                    .strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block BLOCK_OF_SEEDS = registerBlocks("block_of_seeds",
            new SeedsBlock(FabricBlockSettings.create()
                    .strength(0.5f).sounds(BlockSoundGroup.GRASS)));
    public static final Block SLIMED_GLOWSTONE_DUST = registerBlocks("slimed_glowstone_dust",
            new SlimedGlowStoneBlock(FabricBlockSettings.create()
                    .sounds(ModSounds.SlimedGlowStoneBlock).luminance(11)
                    .collidable(false).breakInstantly().nonOpaque()));
    //Lamps-----------------------------------------------------------------------------------------------------------\\
    public static final Block LAVA_LAMP = registerBlocks("lava_lamp",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_RED = registerBlocks("lava_lamp_red",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_BLUE = registerBlocks("lava_lamp_blue",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_YELLOW = registerBlocks("lava_lamp_yellow",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_LIME = registerBlocks("lava_lamp_lime",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_PINK = registerBlocks("lava_lamp_pink",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block LAVA_LAMP_PURPLE = registerBlocks("lava_lamp_purple",
            new LavaLamp(FabricBlockSettings.create()
                    .strength(2.5f).luminance(9).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    //Walls-----------------------------------------------------------------------------------------------------------\\
    public static final Block OAK_WALL = registerBlocks("oak_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block SPRUCE_WALL = registerBlocks("spruce_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block BIRCH_WALL = registerBlocks("birch_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block JUNGLE_WALL = registerBlocks("jungle_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ACACIA_WALL = registerBlocks("acacia_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block DARK_OAK_WALL = registerBlocks("dark_oak_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block MANGROVE_WALL = registerBlocks("mangrove_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block CHERRY_WALL = registerBlocks("cherry_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block BAMBOO_WALL = registerBlocks("bamboo_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block CRIMSON_WALL = registerBlocks("crimson_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block WARPED_WALL = registerBlocks("warped_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    //Alt Oak---------------------------------------------------------------------------------------------------------\\
    public static final Block ALT_OAK_PLANK = registerBlocks("alt_oak_plank", new Block(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_STAIRS = registerBlocks("alt_oak_stairs", new StairsBlock(ModBlocks.ALT_OAK_PLANK.getDefaultState(),
            FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_SLAB = registerBlocks("alt_oak_slab", new SlabBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_BUTTON = registerBlocks("alt_oak_button", new ButtonBlock(BlockSetType.OAK, 10,
            FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(WOOD).noCollision()));
    public static final Block ALT_OAK_PRESSURE_PLATE = registerBlocks("alt_oak_pressure_plate", new PressurePlateBlock(BlockSetType.OAK,
            FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(WOOD).noCollision()));
    public static final Block ALT_OAK_FENCE = registerBlocks("alt_oak_fence", new FenceBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_FENCE_GATE = registerBlocks("alt_oak_fence_gate", new FenceGateBlock(WoodType.OAK,
            FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_WALL = registerBlocks("alt_oak_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_OAK_DOOR = registerBlocks("alt_oak_door", new DoorBlock(BlockSetType.OAK, FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD).nonOpaque()));
    public static final Block ALT_OAK_TRAPDOOR = registerBlocks("alt_oak_trapdoor", new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD).nonOpaque()));
    //Alt Spruce------------------------------------------------------------------------------------------------------\\
    public static final Block ALT_SPRUCE_PLANK = registerBlocks("alt_spruce_plank", new Block(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_SPRUCE_STAIRS = registerBlocks("alt_spruce_stairs", new StairsBlock(ModBlocks.ALT_SPRUCE_PLANK.getDefaultState(),
            FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_SPRUCE_SLAB = registerBlocks("alt_spruce_slab", new SlabBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_SPRUCE_WALL = registerBlocks("alt_spruce_wall", new WallBlock(FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD)));
    public static final Block ALT_SPRUCE_DOOR = registerBlocks("alt_spruce_door", new DoorBlock(BlockSetType.SPRUCE, FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD).nonOpaque()));
    public static final Block ALT_SPRUCE_TRAPDOOR = registerBlocks("alt_spruce_trapdoor", new TrapdoorBlock(BlockSetType.SPRUCE, FabricBlockSettings.create()
            .sounds(BlockSoundGroup.WOOD).strength(WOOD).nonOpaque()));
    //----------------------------------------------------------------------------------------------------------------\\
    private static void addBlocksToBuilding(FabricItemGroupEntries entries){
        //ALT_OAK
        entries.addAfter(Items.OAK_BUTTON, ModBlocks.ALT_OAK_PLANK);
        entries.addAfter(ModBlocks.ALT_OAK_PLANK, ModBlocks.ALT_OAK_STAIRS);
        entries.addAfter(ModBlocks.ALT_OAK_STAIRS, ModBlocks.ALT_OAK_SLAB);
        entries.addAfter(ModBlocks.ALT_OAK_SLAB, ModBlocks.ALT_OAK_WALL);
        entries.addAfter(ModBlocks.ALT_OAK_WALL, ModBlocks.ALT_OAK_FENCE);
        entries.addAfter(ModBlocks.ALT_OAK_FENCE, ModBlocks.ALT_OAK_FENCE_GATE);
        entries.addAfter(ModBlocks.ALT_OAK_FENCE_GATE, ModBlocks.ALT_OAK_DOOR);
        entries.addAfter(ModBlocks.ALT_OAK_DOOR, ModBlocks.ALT_OAK_TRAPDOOR);
        entries.addAfter(ModBlocks.ALT_OAK_TRAPDOOR, ModBlocks.ALT_OAK_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.ALT_OAK_PRESSURE_PLATE, ModBlocks.ALT_OAK_BUTTON);
        //ALT_SPRUCE
        entries.addAfter(Items.SPRUCE_BUTTON, ModBlocks.ALT_SPRUCE_PLANK);
        entries.addAfter(ModBlocks.ALT_SPRUCE_PLANK, ModBlocks.ALT_SPRUCE_STAIRS);
        entries.addAfter(ModBlocks.ALT_SPRUCE_STAIRS, ModBlocks.ALT_SPRUCE_SLAB);
        entries.addAfter(ModBlocks.ALT_SPRUCE_SLAB, ModBlocks.ALT_SPRUCE_WALL);
        entries.addAfter(ModBlocks.ALT_SPRUCE_WALL, ModBlocks.ALT_SPRUCE_DOOR);
        entries.addAfter(ModBlocks.ALT_SPRUCE_DOOR, ModBlocks.ALT_SPRUCE_TRAPDOOR);
        //WALLS
        entries.addAfter(Items.OAK_SLAB, ModBlocks.OAK_WALL);
        entries.addAfter(Items.SPRUCE_SLAB, ModBlocks.SPRUCE_WALL);
        entries.addAfter(Items.BIRCH_SLAB, ModBlocks.BIRCH_WALL);
        entries.addAfter(Items.JUNGLE_SLAB, ModBlocks.JUNGLE_WALL);
        entries.addAfter(Items.DARK_OAK_SLAB, ModBlocks.DARK_OAK_WALL);
        entries.addAfter(Items.MANGROVE_SLAB, ModBlocks.MANGROVE_WALL);
        entries.addAfter(Items.CHERRY_SLAB, ModBlocks.CHERRY_WALL);
        entries.addAfter(Items.BAMBOO_SLAB, ModBlocks.BAMBOO_WALL);
        entries.addAfter(Items.WARPED_SLAB, ModBlocks.WARPED_WALL);
        entries.addAfter(Items.CRIMSON_SLAB, ModBlocks.CRIMSON_WALL);
        entries.addAfter(Items.ACACIA_SLAB, ModBlocks.ACACIA_WALL);
    }
    //----------------------------------------------------------------------------------------------------------------\\
    public static Block registerBlocks(String id, Block block) {                                //Block register method
        registerItemBlock(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(Pisi.MOD_ID, id), block);
    }

    public static Item registerItemBlock(String id, Block block) {                              //Item for block register method
        return Registry.register(Registries.ITEM, new Identifier(Pisi.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Pisi.LOGGER.info("PisiBlocks");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuilding);
    }

}
