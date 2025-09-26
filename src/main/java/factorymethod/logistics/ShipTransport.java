package factorymethod.logistics;

public class ShipTransport extends Transport {
	@Override
	Vehicle createVehicle() {
		return new Ship();
	}
}
