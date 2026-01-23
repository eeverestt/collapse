package com.everest.collapse.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CollapseItemGroups {

    public static final ItemGroup COLLAPSE_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of("collapse", "collapse"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(BlockRegistry.COLLAPSE_WHITE_CUBE))
                    .displayName(Text.literal("COLLAPSE!"))
                    .entries((context, entries) -> {

                        entries.add(BlockRegistry.COLLAPSE_AMBER_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BLACK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BRIGHT_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BRIGHT_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BROWN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CHESTNUT_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CYAN_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_MODERATE_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DEEP_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DEEP_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ELECTRIC_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ELECTRIC_VIOLET_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_EMERALD_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_FOREST_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GOLDEN_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GRAY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_HOT_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LEMON_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_CYAN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_GRAY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_SKY_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIME_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_MAGENTA_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_MINT_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_MODERATE_VIOLET_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_NEON_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_NEON_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_OLIVE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_OLIVE_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ORANGE_RED_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PEACH_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PETROL_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_REDDISH_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_RED_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ROYAL_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_SKY_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_STEEL_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_TAN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_TEAL_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_TURQOISE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_VIOLET_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_VIVID_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_VIVID_RED_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_WHITE_CUBE);
                    })
                    .build()
    );

    public static void init() {}
}
