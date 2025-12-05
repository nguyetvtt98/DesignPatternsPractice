package factorymethod.cache;

public class SopFilterCacheAccessor extends CacheAccessor {
	@Override
	public CacheProcessor createCache() {
		return new SopFilterCache();
	}
}
