package com.thaddev.room9.mechanics.inits;

import com.thaddev.room9.Room9;
import com.thaddev.room9.content.items.BanHammerItem;
import com.thaddev.room9.content.items.TaserItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

    public static final Item TASER = registerItem("taser",
        new TaserItem(
            new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.MATERIALS)
                .rarity(Rarity.UNCOMMON)
        ));

    public static final Item BAN_HAMMER = registerItem("ban_hammer",
        new BanHammerItem(11, -3.5f,
            new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.TOOLS)
                .rarity(Rarity.UNCOMMON)
        ));


    public static void registerItems() {
        Room9.LOGGER.info("Registering Items for " + Room9.MODID + " (1/4)");
    }
}
