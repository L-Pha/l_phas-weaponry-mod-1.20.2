package net.lpha.lphas_weaponry_mod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.lpha.lphas_weaponry_mod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    private final static List<ItemConvertible> SMELTED_INTO_COKE = List.of(Items.COAL, Items.CHARCOAL);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SMELTED_INTO_COKE, RecipeCategory.MISC, ModItems.COKE, 0.7f, 200, "coke");
        offerBlasting(exporter, SMELTED_INTO_COKE, RecipeCategory.MISC, ModItems.COKE, 0.7f, 100, "coke");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REINFORCED_IRON_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_IRON_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REINFORCED_IRON_NUGGET, RecipeCategory.MISC, ModItems.REINFORCED_IRON_INGOT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_NUGGET, RecipeCategory.MISC, ModItems.STEEL_INGOT);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);

//        BLOB recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_BLOB, 1)
                .pattern("NN")
                .pattern("NN")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_BLOB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_BLOB, 1)
                .pattern("NN")
                .pattern("NN")
                .input('N', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_BLOB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_BLOB, 1)
                .pattern("NN")
                .pattern("NN")
                .input('N', ModItems.COPPER_NUGGET)
                .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_BLOB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BLOB, 1)
                .pattern("NN")
                .pattern("NN")
                .input('N', ModItems.STEEL_NUGGET)
               .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
               .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_BLOB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_IRON_BLOB, 1)
                .pattern("NN")
                .pattern("NN")
                .input('N', ModItems.REINFORCED_IRON_NUGGET)
                .criterion(hasItem(ModItems.REINFORCED_IRON_NUGGET), conditionsFromItem(ModItems.REINFORCED_IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.REINFORCED_IRON_BLOB)));

//        BLOB to NUGGET recipes

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.IRON_NUGGET, 4)
                .input(ModItems.IRON_BLOB)
                .criterion(RecipeProvider.hasItem(ModItems.IRON_BLOB), conditionsFromItem(ModItems.IRON_BLOB))
                .offerTo(exporter, new Identifier("IRON_BLOB>IRON_NUGGET"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GOLD_NUGGET, 4)
                .input(ModItems.GOLD_BLOB)
                .criterion(RecipeProvider.hasItem(ModItems.GOLD_BLOB), conditionsFromItem(ModItems.GOLD_BLOB))
                .offerTo(exporter, new Identifier("GOLD_BLOB>GOLD_NUGGET"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_NUGGET, 4)
                .input(ModItems.COPPER_BLOB)
                .criterion(RecipeProvider.hasItem(ModItems.COPPER_BLOB), conditionsFromItem(ModItems.COPPER_BLOB))
                .offerTo(exporter, new Identifier("COPPER_BLOB>COPPER_NUGGET"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_NUGGET, 4)
                .input(ModItems.STEEL_BLOB)
                .criterion(RecipeProvider.hasItem(ModItems.STEEL_BLOB), conditionsFromItem(ModItems.STEEL_BLOB))
                .offerTo(exporter, new Identifier("STEEL_BLOB>STEEL_NUGGET"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_IRON_NUGGET, 4)
                .input(ModItems.REINFORCED_IRON_BLOB)
                .criterion(RecipeProvider.hasItem(ModItems.REINFORCED_IRON_BLOB), conditionsFromItem(ModItems.REINFORCED_IRON_BLOB))
                .offerTo(exporter, new Identifier("REINFORCED_IRON_BLOB>REINFORCED_IRON_NUGGET"));

//        STICK recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_STICK, 1)
                .pattern("N")
                .pattern("N")
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_STICK, 1)
                .pattern("N")
                .pattern("N")
                .input('N', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_STICK, 1)
                .pattern("N")
                .pattern("N")
                .input('N', ModItems.COPPER_NUGGET)
                .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_STICK, 1)
                .pattern("N")
                .pattern("N")
                .input('N', ModItems.STEEL_NUGGET)
               .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
               .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_IRON_STICK, 1)
                .pattern("N")
                .pattern("N")
                .input('N', ModItems.REINFORCED_IRON_NUGGET)
                .criterion(hasItem(ModItems.REINFORCED_IRON_NUGGET), conditionsFromItem(ModItems.REINFORCED_IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.REINFORCED_IRON_STICK)));





    }
}
