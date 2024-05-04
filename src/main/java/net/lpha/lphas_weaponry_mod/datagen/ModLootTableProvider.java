package net.lpha.lphas_weaponry_mod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.lpha.lphas_weaponry_mod.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.REINFORCED_IRON_BLOCK);
        addDrop(ModBlocks.REINFORCED_IRON_BUTTON);

        addDrop(ModBlocks.REINFORCED_IRON_DOOR, doorDrops(ModBlocks.REINFORCED_IRON_DOOR)) ;
        addDrop(ModBlocks.REINFORCED_IRON_TRAPDOOR);

        addDrop(ModBlocks.REINFORCED_IRON_PRESSURE_PLATE);
        addDrop(ModBlocks.STEEL_BUTTON);

        addDrop(ModBlocks.STEEL_DOOR, doorDrops(ModBlocks.STEEL_DOOR));
        addDrop(ModBlocks.STEEL_TRAPDOOR);

        addDrop(ModBlocks.STEEL_PRESSURE_PLATE);


//       addDrop(ModBlocks.MORPHING_GEM_ORE, oreDrops(ModBlocks.MORPHING_GEM_ORE, ModItems.MORPHING_GEM));

    }
}
