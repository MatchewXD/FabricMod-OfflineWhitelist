package com.matchewxd.fabricmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricModOfflineWhitelist implements ModInitializer {
    public static final String MOD_ID = "fabricmodofflinewhitelist";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello, Fabric! Your mod is successfully loaded.");
    }
}

