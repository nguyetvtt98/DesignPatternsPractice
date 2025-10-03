package factorymethod.notificationsender;

public class PushChannel implements Channel {
	@Override
	public void send(String message) {
		System.out.println("Pushing message=" + message);
	}
}
