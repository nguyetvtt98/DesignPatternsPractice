package factorymethod.cache;

import java.util.UUID;

public abstract class CacheAccessor {
	abstract CacheProcessor createCache();
	public void putToCache(UUID id, Object value) {
		CacheProcessor cacheProcessor = createCache();
		cacheProcessor.putToCache(id, value);
	}
}
