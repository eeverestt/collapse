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
                    .icon(() -> new ItemStack(BlockRegistry.COLLAPSE_RED_CUBE))
                    .displayName(Text.literal("COLLAPSE!"))
                    .entries((context, entries) -> {

                        entries.add(BlockRegistry.COLLAPSE_AMBER_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_APPLE_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_AUBURN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_AZURE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BEIGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BLACK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BROWN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BURGUNDY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_BURNT_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CANARY_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CERULEAN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CHARTREUSE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_CYAN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_BLUE_GRAY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DARK_TEAL_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DEEP_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DEEP_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_DUSKY_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ELECTRIC_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_EMERALD_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GOLD_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GRAY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_HUNTER_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_INDIGO_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_IRIS_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIGHT_GRAY_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_LIME_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_MAGENTA_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_MINT_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_OLIVE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PEACH_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PERIWINKLE_BLUE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PINK_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_RED_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_RED_ORANGE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_SAGE_GREEN_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_TEAL_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_VIBRANT_PURPLE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_VIOLET_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_WHITE_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_YELLOW_CUBE);
                        entries.add(BlockRegistry.COLLAPSE_YELLOW_GREEN_CUBE);

                    })
                    .build()
    );

    public static void init() {}
}
