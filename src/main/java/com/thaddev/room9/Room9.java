package com.thaddev.room9;

import com.thaddev.room9.mechanics.inits.ItemInit;
import com.thaddev.room9.mechanics.inits.StructureInit;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class Room9 implements ModInitializer {
    public static final String MODID = "room9";
    public static final Logger LOGGER = Logger.getLogger(MODID);

    public static String VERSION = "1.0.0";
    public static Room9 instance;

    @Override
    public void onInitialize() {
        instance = this;

        Room9.LOGGER.info("Initializing Room9 version " + VERSION);

        ItemInit.registerItems();
        StructureInit.registerStructureFeatures();
    }
}
