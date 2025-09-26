package factorymethod.transportbookingsystem;

public class BikeBooking extends RideBooking {
	@Override
	Ride createRide() {
		return new BikeRide();
	}
}
