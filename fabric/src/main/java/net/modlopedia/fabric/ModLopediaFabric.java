package net.modlopedia.fabric;

import net.modlopedia.fabric.registry.ItemsRegistry;
import net.modlopedia.fabriclike.ModLopediaFabricLike;
import net.fabricmc.api.ModInitializer;

public class ModLopediaFabric implements ModInitializer {
    @Override
    public void onInitialize() {

        ItemsRegistry.registerItems();

    }
}
