package factorymethod.transportbookingsystem;

import static factorymethod.transportbookingsystem.TransportType.CAR;

public class CarRide implements Ride {
	@Override
	public TransportType getType() {
		return CAR;
	}

	@Override
	public double calculatePrice(int distance) {
		return 10000 + 12000 * distance;
	}

	@Override
	public boolean book(String user) {
		System.out.println(user + " has booked a " + getType());
		return false;
	}
}
