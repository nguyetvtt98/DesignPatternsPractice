package abstractfactory.databaseconnector;

public class PostgresCommand implements Command {
	@Override
	public void setCommand(String text) {
		System.out.println("Setting command for " + text);
	}
}
