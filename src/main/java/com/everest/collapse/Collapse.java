package com.everest.collapse;

import com.everest.collapse.init.BlockRegistry;
import com.everest.collapse.init.CollapseItemGroups;
import net.fabricmc.api.ModInitializer;

public class Collapse implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockRegistry.init();
        CollapseItemGroups.init();
    }
}
