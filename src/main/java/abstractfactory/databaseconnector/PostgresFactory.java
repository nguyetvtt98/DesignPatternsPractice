package abstractfactory.databaseconnector;

public class PostgresFactory implements DatabaseFactory {
	@Override
	public Connection createConnection() {
		return new PostgresConnection();
	}

	@Override
	public Command createCommand() {
		return new PostgresCommand();
	}
}
