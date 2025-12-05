package factorymethod.cache;

import java.util.UUID;

public interface CacheProcessor {
	CacheType getType();
	void putToCache(UUID id, Object value);
}
