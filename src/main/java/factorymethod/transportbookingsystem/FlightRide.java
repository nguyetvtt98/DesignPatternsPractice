package factorymethod.transportbookingsystem;

import static factorymethod.transportbookingsystem.TransportType.FLIGHT;

public class FlightRide implements Ride {
	@Override
	public TransportType getType() {
		return FLIGHT;
	}

	@Override
	public double calculatePrice(int distance) {
		return 1000000 + 1200000 * distance;
	}

	@Override
	public boolean book(String user) {
		System.out.println(user + " has booked a " + getType());
		return true;
	}
}
