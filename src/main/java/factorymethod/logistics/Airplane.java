package factorymethod.logistics;

import static factorymethod.logistics.VehicleType.AIRPLANE;

public class Airplane implements Vehicle {
	@Override
	public VehicleType getType() {
		return AIRPLANE;
	}

	@Override
	public void delivery() {
		System.out.println(getType() + ": Deliver by air.");
	}
}
