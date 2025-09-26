package factorymethod.transportbookingsystem;

import static factorymethod.transportbookingsystem.TransportType.BIKE;

public class BikeRide implements Ride {
	@Override
	public TransportType getType() {
		return BIKE;
	}

	@Override
	public double calculatePrice(int distance) {
		return 100000 + 150000 * distance;
	}

	@Override
	public boolean book(String user) {
		System.out.println(user + " has booked a " + getType());
		return true;
	}
}
