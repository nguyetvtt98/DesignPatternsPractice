package abstractfactory.uitoolkit;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class UIFactoryRegistry {

	private final Map<String, Supplier<UIFactory>> factoryMap = new HashMap<>();
	public UIFactoryRegistry register(String key, Supplier<UIFactory> supplier) {
		factoryMap.put(Objects.requireNonNull(key), supplier);
		return this;
	}

	public UIFactory get(String key) {
		return factoryMap.getOrDefault(key == null ? "" : key, LightThemeFactory::new).get();
	}
}
