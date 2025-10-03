package factorymethod.notificationsender;

public class SlackNotification extends NotificationSender {
	@Override
	Channel createChannel() {
		return new SlackChannel();
	}
}
