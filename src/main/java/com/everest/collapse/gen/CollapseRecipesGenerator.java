package com.everest.collapse.gen;

import com.everest.collapse.init.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CollapseRecipesGenerator extends FabricRecipeProvider {
    public CollapseRecipesGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        registerAllStonecutting(recipeExporter, RecipeCategory.BUILDING_BLOCKS);
    }

    public static void registerAllStonecutting(RecipeExporter exporter, RecipeCategory category) {
        Block[] collapseCubes = {
                BlockRegistry.COLLAPSE_AMBER_CUBE,
                BlockRegistry.COLLAPSE_APPLE_GREEN_CUBE,
                BlockRegistry.COLLAPSE_AUBURN_CUBE,
                BlockRegistry.COLLAPSE_AZURE_CUBE,
                BlockRegistry.COLLAPSE_BEIGE_CUBE,
                BlockRegistry.COLLAPSE_BLACK_CUBE,
                BlockRegistry.COLLAPSE_BLUE_CUBE,
                BlockRegistry.COLLAPSE_BROWN_CUBE,
                BlockRegistry.COLLAPSE_BURGUNDY_CUBE,
                BlockRegistry.COLLAPSE_CANARY_YELLOW_CUBE,
                BlockRegistry.COLLAPSE_CERULEAN_CUBE,
                BlockRegistry.COLLAPSE_CHARTREUSE_CUBE,
                BlockRegistry.COLLAPSE_CYAN_CUBE,
                BlockRegistry.COLLAPSE_DARK_BLUE_CUBE,
                BlockRegistry.COLLAPSE_DARK_BLUE_GRAY_CUBE,
                BlockRegistry.COLLAPSE_DARK_GREEN_CUBE,
                BlockRegistry.COLLAPSE_DARK_ORANGE_CUBE,
                BlockRegistry.COLLAPSE_DARK_TEAL_CUBE,
                BlockRegistry.COLLAPSE_DEEP_ORANGE_CUBE,
                BlockRegistry.COLLAPSE_DEEP_PINK_CUBE,
                BlockRegistry.COLLAPSE_DUSKY_BLUE_CUBE,
                BlockRegistry.COLLAPSE_EMERALD_GREEN_CUBE,
                BlockRegistry.COLLAPSE_GOLD_CUBE,
                BlockRegistry.COLLAPSE_GRAY_CUBE,
                BlockRegistry.COLLAPSE_GREEN_CUBE,
                BlockRegistry.COLLAPSE_HUNTER_GREEN_CUBE,
                BlockRegistry.COLLAPSE_INDIGO_CUBE,
                BlockRegistry.COLLAPSE_IRIS_CUBE,
                BlockRegistry.COLLAPSE_LIGHT_BLUE_CUBE,
                BlockRegistry.COLLAPSE_LIGHT_GRAY_CUBE,
                BlockRegistry.COLLAPSE_LIME_GREEN_CUBE,
                BlockRegistry.COLLAPSE_MAGENTA_CUBE,
                BlockRegistry.COLLAPSE_MINT_GREEN_CUBE,
                BlockRegistry.COLLAPSE_OLIVE_CUBE,
                BlockRegistry.COLLAPSE_ORANGE_CUBE,
                BlockRegistry.COLLAPSE_PEACH_CUBE,
                BlockRegistry.COLLAPSE_PERIWINKLE_BLUE_CUBE,
                BlockRegistry.COLLAPSE_PINK_CUBE,
                BlockRegistry.COLLAPSE_PURPLE_CUBE,
                BlockRegistry.COLLAPSE_RED_CUBE,
                BlockRegistry.COLLAPSE_RED_ORANGE_CUBE,
                BlockRegistry.COLLAPSE_SAGE_GREEN_CUBE,
                BlockRegistry.COLLAPSE_TEAL_CUBE,
                BlockRegistry.COLLAPSE_VIBRANT_PURPLE_CUBE,
                BlockRegistry.COLLAPSE_VIOLET_CUBE,
                BlockRegistry.COLLAPSE_WHITE_CUBE,
                BlockRegistry.COLLAPSE_YELLOW_CUBE
        };

        ItemConvertible whiteWool = Items.WHITE_WOOL;

        for (Block cube : collapseCubes) {
            offerStonecuttingRecipe(exporter, category, cube.asItem(), whiteWool);
        }

        for (Block fromCube : collapseCubes) {
            for (Block toCube : collapseCubes) {
                if (fromCube != toCube) {
                    offerStonecuttingRecipe(exporter, category, toCube.asItem(), fromCube);
                }
            }
        }
    }

}
