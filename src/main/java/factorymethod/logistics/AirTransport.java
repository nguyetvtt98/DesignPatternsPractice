package factorymethod.logistics;

public class AirTransport extends Transport {
	@Override
	Vehicle createVehicle() {
		return new Airplane();
	}
}
