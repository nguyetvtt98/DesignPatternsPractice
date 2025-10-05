package abstractfactory.databaseconnector;

public class OracleConnection implements Connection {

	@Override
	public void connect(String url) {
		System.out.println("Connecting to OracleDB using url=" + url);
	}
}
