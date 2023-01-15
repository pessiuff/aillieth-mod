package me.pessiuff.aillieth;

import me.pessiuff.aillieth.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AilliethMod implements ModInitializer {
	public static final String MOD_ID = "aillieth";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		LOGGER.info("Mod initialized!");
	}
}
