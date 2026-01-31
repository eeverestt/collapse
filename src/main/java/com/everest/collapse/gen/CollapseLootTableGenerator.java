package com.everest.collapse.gen;

import com.everest.collapse.init.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CollapseLootTableGenerator extends FabricBlockLootTableProvider {
    protected CollapseLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
	public void generate() {
        addDrop(BlockRegistry.COLLAPSE_AMBER_CUBE);
        addDrop(BlockRegistry.COLLAPSE_APPLE_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_AUBURN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_AZURE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_BEIGE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_BLACK_CUBE);
        addDrop(BlockRegistry.COLLAPSE_BLUE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_BROWN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_BURGUNDY_CUBE);
        addDrop(BlockRegistry.COLLAPSE_CANARY_YELLOW_CUBE);
        addDrop(BlockRegistry.COLLAPSE_CERULEAN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_CHARTREUSE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_CYAN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DARK_BLUE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DARK_BLUE_GRAY_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DARK_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DARK_ORANGE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DARK_TEAL_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DEEP_ORANGE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DEEP_PINK_CUBE);
        addDrop(BlockRegistry.COLLAPSE_DUSKY_BLUE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_EMERALD_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_GOLD_CUBE);
        addDrop(BlockRegistry.COLLAPSE_GRAY_CUBE);
        addDrop(BlockRegistry.COLLAPSE_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_HUNTER_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_INDIGO_CUBE);
        addDrop(BlockRegistry.COLLAPSE_IRIS_CUBE);
        addDrop(BlockRegistry.COLLAPSE_LIGHT_BLUE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_LIGHT_GRAY_CUBE);
        addDrop(BlockRegistry.COLLAPSE_LIME_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_MAGENTA_CUBE);
        addDrop(BlockRegistry.COLLAPSE_MINT_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_OLIVE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_ORANGE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_PEACH_CUBE);
        addDrop(BlockRegistry.COLLAPSE_PERIWINKLE_BLUE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_PINK_CUBE);
        addDrop(BlockRegistry.COLLAPSE_PURPLE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_RED_CUBE);
        addDrop(BlockRegistry.COLLAPSE_RED_ORANGE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_SAGE_GREEN_CUBE);
        addDrop(BlockRegistry.COLLAPSE_TEAL_CUBE);
        addDrop(BlockRegistry.COLLAPSE_VIBRANT_PURPLE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_VIOLET_CUBE);
        addDrop(BlockRegistry.COLLAPSE_WHITE_CUBE);
        addDrop(BlockRegistry.COLLAPSE_YELLOW_CUBE);
    }
}