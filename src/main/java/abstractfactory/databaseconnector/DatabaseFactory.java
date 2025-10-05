package abstractfactory.databaseconnector;

public interface DatabaseFactory {
	Connection createConnection();
	Command createCommand();
}
