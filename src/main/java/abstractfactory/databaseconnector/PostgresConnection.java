package abstractfactory.databaseconnector;

public class PostgresConnection implements Connection {
	@Override
	public void connect(String url) {
		System.out.println("Connecting to PostgresDB using url=" + url);
	}
}
