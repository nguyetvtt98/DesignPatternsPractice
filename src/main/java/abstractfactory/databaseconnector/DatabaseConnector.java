package abstractfactory.databaseconnector;

public class DatabaseConnector {
	private DatabaseFactoryRegistry registry;

	public DatabaseConnector(DatabaseFactoryRegistry registry) {
		this.registry = registry;
	}

	public void connectToDb(String dbType, String url, String command) {
		DatabaseFactory databaseFactory = registry.get(dbType);
		Connection connection = databaseFactory.createConnection();
		Command commandDb = databaseFactory.createCommand();
		connection.connect(url);
		commandDb.setCommand(command);
	}
}
