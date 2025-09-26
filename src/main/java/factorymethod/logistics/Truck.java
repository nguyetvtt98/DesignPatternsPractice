package factorymethod.logistics;

import static factorymethod.logistics.VehicleType.TRUCK;

public class Truck implements Vehicle {
	@Override
	public VehicleType getType() {
		return TRUCK;
	}

	@Override
	public void delivery() {
		System.out.println(getType() + ": Deliver by land in a box.");
	}
}
