package com.thaddev.room9.mechanics.inits;

import com.thaddev.room9.Room9;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Room9.MODID, name), item);
    }

    public static final Item EQUATION = registerItem("equation",
        new Item(
            new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.MATERIALS)
                .rarity(Rarity.UNCOMMON)
        ));


    public static void registerItems() {
        Room9.LOGGER.info("Registering Items for " + Room9.MODID + " (1/1)");
    }
}
