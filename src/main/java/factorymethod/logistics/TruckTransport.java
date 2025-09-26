package factorymethod.logistics;

public class TruckTransport extends Transport {

	@Override
	Vehicle createVehicle() {
		return new Truck();
	}
}
