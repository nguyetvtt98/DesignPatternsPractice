package factorymethod.cache;

import java.util.UUID;

public class InstructionCache implements CacheProcessor {
	@Override
	public CacheType getType() {
		return CacheType.INSTRUCTION;
	}

	@Override
	public void putToCache(UUID id, Object value) {
		System.out.println("Put id=" + id + " and value = " + value + " to instruction cache");
	}
}
