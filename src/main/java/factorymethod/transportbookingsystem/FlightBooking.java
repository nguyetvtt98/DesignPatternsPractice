package factorymethod.transportbookingsystem;

public class FlightBooking extends RideBooking {
	@Override
	Ride createRide() {
		return new FlightRide();
	}
}
