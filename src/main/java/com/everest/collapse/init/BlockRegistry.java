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
    public static final Block COLLAPSE_BLACK_CUBE = register("collapse_black_cube");
    public static final Block COLLAPSE_BLUE_CUBE = register("collapse_blue_cube");
    public static final Block COLLAPSE_BRIGHT_GREEN_CUBE = register("collapse_bright_green_cube");
    public static final Block COLLAPSE_BRIGHT_YELLOW_CUBE = register("collapse_bright_yellow_cube");
    public static final Block COLLAPSE_BROWN_CUBE = register("collapse_brown_cube");
    public static final Block COLLAPSE_CHESTNUT_ORANGE_CUBE = register("collapse_chestnut_orange_cube");
    public static final Block COLLAPSE_CYAN_BLUE_CUBE = register("collapse_cyan_blue_cube");
    public static final Block COLLAPSE_DARK_BLUE_CUBE = register("collapse_dark_blue_cube");
    public static final Block COLLAPSE_DARK_GREEN_CUBE = register("collapse_dark_green_cube");
    public static final Block COLLAPSE_DARK_MODERATE_BLUE_CUBE = register("collapse_dark_moderate_blue_cube");
    public static final Block COLLAPSE_DARK_PURPLE_CUBE = register("collapse_dark_purple_cube");
    public static final Block COLLAPSE_DARK_YELLOW_CUBE = register("collapse_dark_yellow_cube");
    public static final Block COLLAPSE_DEEP_ORANGE_CUBE = register("collapse_deep_orange_cube");
    public static final Block COLLAPSE_DEEP_PINK_CUBE = register("collapse_deep_pink_cube");
    public static final Block COLLAPSE_ELECTRIC_PURPLE_CUBE = register("collapse_electric_purple_cube");
    public static final Block COLLAPSE_ELECTRIC_VIOLET_CUBE = register("collapse_electric_violet_cube");
    public static final Block COLLAPSE_EMERALD_GREEN_CUBE = register("collapse_emerald_green_cube");
    public static final Block COLLAPSE_FOREST_GREEN_CUBE = register("collapse_forest_green_cube");
    public static final Block COLLAPSE_GOLDEN_YELLOW_CUBE = register("collapse_golden_yellow_cube");
    public static final Block COLLAPSE_GRAY_CUBE = register("collapse_gray_cube");
    public static final Block COLLAPSE_GREEN_CUBE = register("collapse_green_cube");
    public static final Block COLLAPSE_HOT_PINK_CUBE = register("collapse_hot_pink_cube");
    public static final Block COLLAPSE_LEMON_YELLOW_CUBE = register("collapse_lemon_yellow_cube");
    public static final Block COLLAPSE_LIGHT_BLUE_CUBE = register("collapse_light_blue_cube");
    public static final Block COLLAPSE_LIGHT_CYAN_CUBE = register("collapse_light_cyan_cube");
    public static final Block COLLAPSE_LIGHT_GRAY_CUBE = register("collapse_light_gray_cube");
    public static final Block COLLAPSE_LIGHT_SKY_BLUE_CUBE = register("collapse_light_sky_blue_cube");
    public static final Block COLLAPSE_LIME_GREEN_CUBE = register("collapse_lime_green_cube");
    public static final Block COLLAPSE_MAGENTA_CUBE = register("collapse_magenta_cube");
    public static final Block COLLAPSE_MINT_GREEN_CUBE = register("collapse_mint_green_cube");
    public static final Block COLLAPSE_MODERATE_VIOLET_CUBE = register("collapse_moderate_violet_cube");
    public static final Block COLLAPSE_NEON_GREEN_CUBE = register("collapse_neon_green_cube");
    public static final Block COLLAPSE_NEON_PINK_CUBE = register("collapse_neon_pink_cube");
    public static final Block COLLAPSE_OLIVE_CUBE = register("collapse_olive_cube");
    public static final Block COLLAPSE_OLIVE_YELLOW_CUBE = register("collapse_olive_yellow_cube");
    public static final Block COLLAPSE_ORANGE_CUBE = register("collapse_orange_cube");
    public static final Block COLLAPSE_ORANGE_RED_CUBE = register("collapse_orange_red_cube");
    public static final Block COLLAPSE_PEACH_CUBE = register("collapse_peach_cube");
    public static final Block COLLAPSE_PETROL_GREEN_CUBE = register("collapse_petrol_green_cube");
    public static final Block COLLAPSE_PINK_CUBE = register("collapse_pink_cube");
    public static final Block COLLAPSE_PURPLE_CUBE = register("collapse_purple_cube");
    public static final Block COLLAPSE_REDDISH_ORANGE_CUBE = register("collapse_reddish_orange_cube");
    public static final Block COLLAPSE_RED_CUBE = register("collapse_red_cube");
    public static final Block COLLAPSE_ROYAL_BLUE_CUBE = register("collapse_royal_blue_cube");
    public static final Block COLLAPSE_SKY_BLUE_CUBE = register("collapse_sky_blue_cube");
    public static final Block COLLAPSE_STEEL_BLUE_CUBE = register("collapse_steel_blue_cube");
    public static final Block COLLAPSE_TAN_CUBE = register("collapse_tan_cube");
    public static final Block COLLAPSE_TEAL_CUBE = register("collapse_teal_cube");
    public static final Block COLLAPSE_TURQOISE_CUBE = register("collapse_turqoise_cube");
    public static final Block COLLAPSE_VIOLET_CUBE = register("collapse_violet_cube");
    public static final Block COLLAPSE_VIVID_ORANGE_CUBE = register("collapse_vivid_orange_cube");
    public static final Block COLLAPSE_VIVID_RED_CUBE = register("collapse_vivid_red_cube");
    public static final Block COLLAPSE_WHITE_CUBE = register("collapse_white_cube");

    public static void init() {}
}