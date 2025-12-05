package factorymethod.cache;

public class InstructionCacheAccessor extends CacheAccessor {
	@Override
	CacheProcessor createCache() {
		return new InstructionCache();
	}
}
