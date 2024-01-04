package net.modlopedia.fabric.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.modlopedia.ModLopedia;

import static net.modlopedia.item.ItemsList.*;

public class ItemsRegistry {
    public static void registerItems() {
        ModLopediaBook = Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(ModLopedia.MOD_ID, "modlopedia"),
                new Item(new Item.Properties().stacksTo(1)));

    }
}