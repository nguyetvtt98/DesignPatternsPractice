package abstractfactory.databaseconnector;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DatabaseFactoryRegistry {
	private Map<String, Supplier<DatabaseFactory>> factoryMap = new HashMap<>();

	public DatabaseFactoryRegistry register(String dbType, Supplier<DatabaseFactory> factorySupplier) {
		factoryMap.put(dbType, factorySupplier);
		return this;
	}

	public DatabaseFactory get(String dbType) {
		return factoryMap.get(dbType).get();
	}
}
