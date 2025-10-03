package factorymethod.paymentprocessor;

public class PaypalGateway implements Gateway {
	@Override
	public boolean authorize(int amount) {
		if (amount < 10000) {
			return false;
		}
		return true;
	}

	@Override
	public void capture(int amount) {
		if (authorize(amount)) {
			System.out.println("Payment via Paypal has been done for amount=" + amount);
		}
		else {
			System.out.println("Not enough amount. Payment via Paypal has been rejected.");
		}
	}
}
