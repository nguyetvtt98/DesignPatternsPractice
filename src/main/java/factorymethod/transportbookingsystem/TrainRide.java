package factorymethod.transportbookingsystem;

import static factorymethod.transportbookingsystem.TransportType.TRAIN;

public class TrainRide implements Ride {
	@Override
	public TransportType getType() {
		return TRAIN;
	}

	@Override
	public double calculatePrice(int distance) {
		return 15000 + 12000 * distance;
	}

	@Override
	public boolean book(String user) {
		System.out.println(user + " has booked a " + getType());
		return true;
	}
}
