package net.modlopedia.quilt;

import net.modlopedia.fabriclike.ModLopediaFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ModLopediaQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        ModLopediaFabricLike.init();
    }
}
