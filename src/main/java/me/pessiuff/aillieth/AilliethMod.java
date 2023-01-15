package me.pessiuff.aillieth;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AilliethMod implements ModInitializer {
	public static final String AILLIETH = "aillieth";
	public static final Logger LOGGER = LoggerFactory.getLogger(AILLIETH);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from Aillieth mod!");
	}
}
