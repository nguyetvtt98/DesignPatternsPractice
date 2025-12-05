package abstractfactory.checkoutsystem;

import java.time.Instant;

public interface ShippingRateService {
	Money quote(Address destination, Cart cart, Instant when);
}
