package factorymethod.paymentprocessor;

public class CryptoGateway implements Gateway {
	@Override
	public boolean authorize(int amount) {
		if (amount < 10 || amount > 1000000) {
			return false;
		}
		return true;
	}

	@Override
	public void capture(int amount) {
		if (authorize(amount)) {
			System.out.println("Payment by Crypto has been done for amount=" + amount);
		}
		else {
			System.out.println("Invalid amount. Payment by Crypto has been rejected.");
		}
	}
}
