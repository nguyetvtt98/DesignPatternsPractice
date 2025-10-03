package factorymethod.notificationsender;

public class SmsChannel implements Channel {
	@Override
	public void send(String message) {
		System.out.println("Sending message=" + message + " via SMS channel");
	}
}
