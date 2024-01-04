package net.modlopedia.forge.registry;

import com.google.common.collect.Sets;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modlopedia.ModLopedia;
import net.modlopedia.forge.util.ItemSettingsHelper;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModLopedia.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> ORPHEUS_TAB_ITEMS = Sets.newLinkedHashSet();

    public static final RegistryObject<Item> LYRE = registerWithTab("lyre",
            () -> new Item(ItemSettingsHelper.noStackableItem()));


    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(name, supplier);
        ORPHEUS_TAB_ITEMS.add(item);
        return item;
    }

}