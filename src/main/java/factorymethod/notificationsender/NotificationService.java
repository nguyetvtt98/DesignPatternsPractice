package factorymethod.notificationsender;

public class NotificationService {
	private NotificationFactory factory;
	public NotificationService() {
		this.factory = new NotificationFactory();
	}

	public NotificationFactory getChannelFactory() {
		return factory;
	}
	public void sendMessage(String message) {
		factory.sendMessage(message);
	}

	public void registerNewSender(NotificationSender sender) {
		factory.register(sender);
	}
}
