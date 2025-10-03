package factorymethod.notificationsender;

public class SlackChannel implements Channel {
	@Override
	public void send(String message) {
		System.out.println("Sending message=" + message + " via Slack channel");
	}
}
