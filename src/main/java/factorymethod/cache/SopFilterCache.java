package factorymethod.cache;

import java.util.UUID;

public class SopFilterCache implements CacheProcessor {
	@Override
	public CacheType getType() {
		return CacheType.SOP_FILTER;
	}

	@Override
	public void putToCache(UUID id, Object value) {
		System.out.println("Put id=" + id + " and value = " + value + " to SopFilter cache");
	}
}
