package net.lpha.lphas_weaponry_mod.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lpha.lphas_weaponry_mod.L_PhasWeaponryMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block REINFORCED_IRON_BLOCK = registerBlock("reinforced_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(50.0f, 1200.0f)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

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
