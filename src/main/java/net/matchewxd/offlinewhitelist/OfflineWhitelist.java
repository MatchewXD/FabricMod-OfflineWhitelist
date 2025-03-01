package net.matchewxd.offlinewhitelist;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OfflineWhitelist implements ModInitializer {
	public static final String MOD_ID = "offlinewhitelist";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[{}] Mod initialized!", MOD_ID);
	}
}
