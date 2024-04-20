package net.lpha.lphas_weaponry_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lpha.lphas_weaponry_mod.L_PhasWeaponryMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WEAPON_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(L_PhasWeaponryMod.MOD_ID, "weapon_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weapon_ingredients"))
                    .icon(() -> new ItemStack(ModItems.IRON_BLOB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IRON_BLOB);
                        entries.add(ModItems.IRON_STICK);
                        entries.add(ModItems.GOLDEN_BLOB);
                        entries.add(ModItems.GOLDEN_STICK);
                        entries.add(ModItems.COPPER_BLOB);
                        entries.add(ModItems.COPPER_STICK);

                    }).build());


    public static void registerItemGroups(){
        L_PhasWeaponryMod.LOGGER.info("Registering Item Groups  for " + L_PhasWeaponryMod.MOD_ID);


    }
}
