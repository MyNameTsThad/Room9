package com.thaddev.room9.mechanics.inits;

import com.thaddev.room9.Room9;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
    public static final Block MORB = registerBlock("morb",
        new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(SoundInit.MORB_SOUNDS)
        ), ItemGroup.MISC);

    public static final Block IDOL = registerBlock("idol",
        new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(SoundInit.IDOL_SOUNDS)
        ), ItemGroup.MISC);

    public static final Block SOIJU = registerBlock("soiju",
        new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(SoundInit.SOIJU_SOUNDS)
            .nonOpaque()
        ), ItemGroup.MISC);

    public static final Block IT_STARTS_WITH = registerBlock("it_starts_with",
        new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(1.5f, 6.0f)
            .sounds(SoundInit.IT_STARTS_WITH_SOUNDS)
        ), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Room9.MODID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Room9.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(
            Registry.ITEM,
            new Identifier(Room9.MODID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks() {
        Room9.LOGGER.info("Registering Blocks for " + Room9.MODID + " (2/4)");
    }
}
