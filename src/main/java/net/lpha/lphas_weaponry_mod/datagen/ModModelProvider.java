package net.lpha.lphas_weaponry_mod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.lpha.lphas_weaponry_mod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REINFORCED_IRON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MORPHING_GEM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IRON_BLOB, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_BLOB, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_BLOB, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_BLOB, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BLOB, Models.GENERATED );
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COKE, Models.GENERATED);

    }
}
