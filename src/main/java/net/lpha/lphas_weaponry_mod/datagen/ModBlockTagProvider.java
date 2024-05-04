package net.lpha.lphas_weaponry_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.REINFORCED_IRON_BLOCK)
                .add(ModBlocks.MORPHING_GEM_ORE)
                .add(ModBlocks.REINFORCED_IRON_BUTTON)
                .add(ModBlocks.REINFORCED_IRON_DOOR)
                .add(ModBlocks.REINFORCED_IRON_TRAPDOOR)
                .add(ModBlocks.REINFORCED_IRON_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_BUTTON)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_PRESSURE_PLATE);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.REINFORCED_IRON_BUTTON)
                .add(ModBlocks.REINFORCED_IRON_DOOR)
                .add(ModBlocks.REINFORCED_IRON_TRAPDOOR)
                .add(ModBlocks.REINFORCED_IRON_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_BUTTON)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.REINFORCED_IRON_BLOCK);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.REINFORCED_IRON_DOOR)
                .add(ModBlocks.STEEL_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.REINFORCED_IRON_TRAPDOOR)
                .add(ModBlocks.STEEL_TRAPDOOR);

         getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.REINFORCED_IRON_BUTTON)
                .add(ModBlocks.STEEL_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.REINFORCED_IRON_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_PRESSURE_PLATE);


    }
}
