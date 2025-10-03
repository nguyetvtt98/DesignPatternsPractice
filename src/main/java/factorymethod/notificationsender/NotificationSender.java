package factorymethod.notificationsender;

public abstract class NotificationSender {
	abstract Channel createChannel();

	void processSendingMessage(String message) {
		Channel channel = createChannel();
		channel.send(message);
	}
}
