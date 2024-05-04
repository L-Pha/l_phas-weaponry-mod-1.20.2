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
        BlockStateModelGenerator.BlockTexturePool steelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool reinforcedIronPool =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_IRON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MORPHING_GEM_ORE);

        steelPool.button(ModBlocks.STEEL_BUTTON);
        steelPool.pressurePlate(ModBlocks.STEEL_PRESSURE_PLATE);
        reinforcedIronPool.button(ModBlocks.REINFORCED_IRON_BUTTON);
        reinforcedIronPool.pressurePlate(ModBlocks.REINFORCED_IRON_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.STEEL_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.REINFORCED_IRON_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STEEL_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.REINFORCED_IRON_TRAPDOOR);



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
