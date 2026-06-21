package org.afterlike.examplemod;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import re.tsuku.fastbus.FastBus;

public class ExampleMod {
	private static final Logger LOGGER = LogManager.getLogger();
	private static final ExampleMod INSTANCE = new ExampleMod();
	private static final String VERSION = org.afterlike.examplemod.BuildConstants.VERSION;
	private final FastBus eventBus;
	public ExampleMod() {
		this.eventBus = new FastBus();
	}

	public void initialize() {
		final long startTime = System.nanoTime();
		// initialization logic
		LOGGER.info("Initialized in {}ms.", (System.nanoTime() - startTime) / 1_000_000);
	}

	public void lateInitialize() {
		// late initialization logic
	}

	public static ExampleMod get() {
		return Objects.requireNonNull(INSTANCE);
	}

	public FastBus getEventBus() {
		return eventBus;
	}

	public String getVersion() {
		return VERSION;
	}
}