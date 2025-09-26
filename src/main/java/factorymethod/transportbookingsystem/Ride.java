package factorymethod.transportbookingsystem;

public interface Ride {
	TransportType getType();
	double calculatePrice(int distance);
	boolean book(String user);
}
