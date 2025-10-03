package factorymethod.notificationsender;

import java.util.HashSet;
import java.util.Set;

public class NotificationFactory {
	private Set<NotificationSender> channels = new HashSet<>();
	public NotificationFactory register(NotificationSender sender) {
		channels.add(sender);
		return this;
	}

	public void sendMessage(String message) {
		channels.stream()
				.forEach(e -> e.processSendingMessage(message));
	}
}
