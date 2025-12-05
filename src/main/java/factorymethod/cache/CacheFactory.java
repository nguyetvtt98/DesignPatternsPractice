package factorymethod.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheFactory {

	private final Map<CacheType, CacheAccessor> cacheAccessorMap = new HashMap<>();

	public CacheAccessor of(CacheType cacheType) {
		return cacheAccessorMap.get(cacheType);
	}

	public void register(CacheType cacheType, CacheAccessor cacheAccessor) {
		cacheAccessorMap.put(cacheType, cacheAccessor);
	}
}
