package factorymethod.notificationsender;

public class PushNotification extends NotificationSender {
	@Override
	Channel createChannel() {
		return new PushChannel();
	}
}
