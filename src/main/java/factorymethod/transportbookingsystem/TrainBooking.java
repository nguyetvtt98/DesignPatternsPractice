package factorymethod.transportbookingsystem;

public class TrainBooking extends RideBooking {
	@Override
	Ride createRide() {
		return new TrainRide();
	}
}
