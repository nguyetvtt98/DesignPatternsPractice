package factorymethod.logistics;

public abstract class Transport {
	abstract Vehicle createVehicle();
	public void startDelivery() {
		Vehicle vehicle = createVehicle();
		vehicle.delivery();
	}
}
