package net.lpha.lphas_weaponry_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lpha.lphas_weaponry_mod.L_PhasWeaponryMod;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup L_PHAS_WEAPONRY_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(L_PhasWeaponryMod.MOD_ID, "lphas_weaponry_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lphas_weaponry_ingredients"))
                    .icon(() -> new ItemStack(ModItems.IRON_BLOB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IRON_BLOB);
                        entries.add(ModItems.IRON_STICK);
                        entries.add(ModItems.GOLDEN_BLOB);
                        entries.add(ModItems.GOLDEN_STICK);
                        entries.add(ModItems.COPPER_BLOB);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.COPPER_STICK);
                        entries.add(ModItems.REINFORCED_IRON_INGOT);
                        entries.add(ModItems.REINFORCED_IRON_BLOB);
                        entries.add(ModItems.REINFORCED_IRON_NUGGET);
                        entries.add(ModItems.REINFORCED_IRON_STICK);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_BLOB);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_STICK);

                    }).build());

    public static final ItemGroup L_PHAS_WEAPONRY_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(L_PhasWeaponryMod.MOD_ID, "lphas_weaponry_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lphas_weaponry_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.REINFORCED_IRON_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.REINFORCED_IRON_BLOCK);
                        entries.add(ModBlocks.STEEL_BLOCK);


                    }).build());


    public static void registerItemGroups(){
        L_PhasWeaponryMod.LOGGER.info("Registering ModItemGroups  for " + L_PhasWeaponryMod.MOD_ID);


    }
}
