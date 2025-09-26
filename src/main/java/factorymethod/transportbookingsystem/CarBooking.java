package factorymethod.transportbookingsystem;

public class CarBooking extends RideBooking {
	@Override
	Ride createRide() {
		return new CarRide();
	}
}
