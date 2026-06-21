package org.afterlike.examplemod;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import re.tsuku.fastbus.FastBus;

public class ExampleMod {
	private static final @Nullable ExampleMod instance = new ExampleMod();
	private static final @NotNull String VERSION = org.afterlike.examplemod.BuildConstants.VERSION;
	private final FastBus eventBus;
	public ExampleMod() {
		this.eventBus = new FastBus();
	}

	public static @NotNull ExampleMod get() {
		return Objects.requireNonNull(instance);
	}

	public FastBus getEventBus() {
		return eventBus;
	}

	public @NotNull String getVersion() {
		return VERSION;
	}
}