package abstractfactory.checkoutsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

public class RegionFactoryRegistry {
	private final Map<String, RegionFactory> factoryMap = new HashMap<>();

	public RegionFactoryRegistry() {
		ServiceLoader<RegionFactoryProvider> loader = ServiceLoader.load(RegionFactoryProvider.class);
		for (var p : loader) {
			factoryMap.put(p.key(), p.create());
		}
	}

	public RegionFactory get(String key) {
		return factoryMap.getOrDefault(key, factoryMap.values().stream().findFirst().orElseThrow());
	}

	public Set<String> keys() {
		return factoryMap.keySet();
	}
}
