package factorymethod.transportbookingsystem;

public abstract class RideBooking {
	abstract Ride createRide();
	public void bookRide(String user, int distance) {
		Ride ride = createRide();
		ride.book(user);
		double price = ride.calculatePrice(distance);
		System.out.println("Total price: " + price);
	}
}
