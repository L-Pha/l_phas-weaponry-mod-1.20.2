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

//       addDrop(ModBlocks.MORPHING_GEM_ORE, oreDrops(ModBlocks.MORPHING_GEM_ORE, ModItems.MORPHING_GEM));

    }
}
