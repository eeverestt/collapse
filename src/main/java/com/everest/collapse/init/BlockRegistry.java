package com.everest.collapse.init;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    private static Block register(String name) {
        Block block = Registry.register(
                Registries.BLOCK,
                Identifier.of("collapse", name),
                new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("collapse", name),
                new BlockItem(block, new Item.Settings())
        );

        return block;
    }

    public static final Block COLLAPSE_AMBER_CUBE = register("collapse_amber_cube");
    public static final Block COLLAPSE_APPLE_GREEN_CUBE = register("collapse_apple_green_cube");
    public static final Block COLLAPSE_AUBURN_CUBE = register("collapse_auburn_cube");
    public static final Block COLLAPSE_AZURE_CUBE = register("collapse_azure_cube");
    public static final Block COLLAPSE_BEIGE_CUBE = register("collapse_beige_cube");
    public static final Block COLLAPSE_BLACK_CUBE = register("collapse_black_cube");
    public static final Block COLLAPSE_BLUE_CUBE = register("collapse_blue_cube");
    public static final Block COLLAPSE_BROWN_CUBE = register("collapse_brown_cube");
    public static final Block COLLAPSE_BURGUNDY_CUBE = register("collapse_burgundy_cube");
    public static final Block COLLAPSE_CANARY_YELLOW_CUBE = register("collapse_canary_yellow_cube");
    public static final Block COLLAPSE_CERULEAN_CUBE = register("collapse_cerulean_cube");
    public static final Block COLLAPSE_CHARTREUSE_CUBE = register("collapse_chartreuse_cube");
    public static final Block COLLAPSE_CYAN_CUBE = register("collapse_cyan_cube");
    public static final Block COLLAPSE_DARK_BLUE_CUBE = register("collapse_dark_blue_cube");
    public static final Block COLLAPSE_DARK_BLUE_GRAY_CUBE = register("collapse_dark_blue_gray_cube");
    public static final Block COLLAPSE_DARK_GREEN_CUBE = register("collapse_dark_green_cube");
    public static final Block COLLAPSE_DARK_ORANGE_CUBE = register("collapse_dark_orange_cube");
    public static final Block COLLAPSE_DARK_TEAL_CUBE = register("collapse_dark_teal_cube");
    public static final Block COLLAPSE_DEEP_ORANGE_CUBE = register("collapse_deep_orange_cube");
    public static final Block COLLAPSE_DEEP_PINK_CUBE = register("collapse_deep_pink_cube");
    public static final Block COLLAPSE_DUSKY_BLUE_CUBE = register("collapse_dusky_blue_cube");
    public static final Block COLLAPSE_EMERALD_GREEN_CUBE = register("collapse_emerald_green_cube");
    public static final Block COLLAPSE_GOLD_CUBE = register("collapse_gold_cube");
    public static final Block COLLAPSE_GRAY_CUBE = register("collapse_gray_cube");
    public static final Block COLLAPSE_GREEN_CUBE = register("collapse_green_cube");
    public static final Block COLLAPSE_HUNTER_GREEN_CUBE = register("collapse_hunter_green_cube");
    public static final Block COLLAPSE_INDIGO_CUBE = register("collapse_indigo_cube");
    public static final Block COLLAPSE_IRIS_CUBE = register("collapse_iris_cube");
    public static final Block COLLAPSE_LIGHT_BLUE_CUBE = register("collapse_light_blue_cube");
    public static final Block COLLAPSE_LIGHT_GRAY_CUBE = register("collapse_light_gray_cube");
    public static final Block COLLAPSE_LIME_GREEN_CUBE = register("collapse_lime_green_cube");
    public static final Block COLLAPSE_MAGENTA_CUBE = register("collapse_magenta_cube");
    public static final Block COLLAPSE_MINT_GREEN_CUBE = register("collapse_mint_green_cube");
    public static final Block COLLAPSE_OLIVE_CUBE = register("collapse_olive_cube");
    public static final Block COLLAPSE_ORANGE_CUBE = register("collapse_orange_cube");
    public static final Block COLLAPSE_PEACH_CUBE = register("collapse_peach_cube");
    public static final Block COLLAPSE_PERIWINKLE_BLUE_CUBE = register("collapse_periwinkle_blue_cube");
    public static final Block COLLAPSE_PINK_CUBE = register("collapse_pink_cube");
    public static final Block COLLAPSE_PURPLE_CUBE = register("collapse_purple_cube");
    public static final Block COLLAPSE_RED_CUBE = register("collapse_red_cube");
    public static final Block COLLAPSE_RED_ORANGE_CUBE = register("collapse_red_orange_cube");
    public static final Block COLLAPSE_SAGE_GREEN_CUBE = register("collapse_sage_green_cube");
    public static final Block COLLAPSE_TEAL_CUBE = register("collapse_teal_cube");
    public static final Block COLLAPSE_VIBRANT_PURPLE_CUBE = register("collapse_vibrant_purple_cube");
    public static final Block COLLAPSE_VIOLET_CUBE = register("collapse_violet_cube");
    public static final Block COLLAPSE_WHITE_CUBE = register("collapse_white_cube");
    public static final Block COLLAPSE_YELLOW_CUBE = register("collapse_yellow_cube");

    public static void init() {}
}