package factorymethod.notificationsender;

public class EmailChannel implements Channel {
	@Override
	public void send(String message) {
		System.out.println("Sending message=" + message + " via email channel");
	}
}
