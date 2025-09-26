package factorymethod.transportbookingsystem;

public class BookingService {

	public void bookVehicle(RideBooking rideBooking, String user, int distance) {
		rideBooking.bookRide(user, distance);
	}
}
