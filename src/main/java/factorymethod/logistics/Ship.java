package factorymethod.logistics;

import static factorymethod.logistics.VehicleType.SHIP;

public class Ship implements Vehicle {
	@Override
	public VehicleType getType() {
		return SHIP;
	}

	@Override
	public void delivery() {
		System.out.println(getType() + ": Deliver by sea in a container.");
	}
}
