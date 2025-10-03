package factorymethod.notificationsender;

public class EmailNotification extends NotificationSender {
	@Override
	Channel createChannel() {
		return new EmailChannel();
	}
}
