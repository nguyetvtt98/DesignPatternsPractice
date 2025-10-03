package factorymethod.paymentprocessor;

public class VisaGateway implements Gateway {
	@Override
	public boolean authorize(int amount) {
		if (amount > 50000) {
			return true;
		}
		return false;
	}

	@Override
	public void capture(int amount) {
		if (authorize(amount)) {
			System.out.println("Payment via Visa has been done for amount=" + amount);
		}
		else {
			System.out.println("Not enough amount. Payment via Via has been rejected.");
		}
	}
}
