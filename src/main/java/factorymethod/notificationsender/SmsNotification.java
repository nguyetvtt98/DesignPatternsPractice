package factorymethod.notificationsender;

public class SmsNotification extends NotificationSender {
	@Override
	Channel createChannel() {
		return new SmsChannel();
	}
}
