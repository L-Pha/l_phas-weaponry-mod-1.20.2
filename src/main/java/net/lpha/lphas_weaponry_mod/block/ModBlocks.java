package net.lpha.lphas_weaponry_mod.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lpha.lphas_weaponry_mod.L_PhasWeaponryMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block REINFORCED_IRON_BLOCK = registerBlock("reinforced_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(50.0f, 1200.0f)));
    public static final Block REINFORCED_IRON_BUTTON = registerBlock("reinforced_iron_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 30, false));
    public static final Block REINFORCED_IRON_PRESSURE_PLATE = registerBlock("reinforced_iron_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final Block REINFORCED_IRON_DOOR = registerBlock("reinforced_iron_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block REINFORCED_IRON_TRAPDOOR = registerBlock("reinforced_iron_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));



    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));

    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));

    public static final Block MORPHING_GEM_ORE = registerBlock("morphing_gem_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE), UniformIntProvider.create(5, 7)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(L_PhasWeaponryMod.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(L_PhasWeaponryMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        L_PhasWeaponryMod.LOGGER.info("Registering ModBLocks for " + L_PhasWeaponryMod.MOD_ID);

    }
}
