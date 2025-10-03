package factorymethod.paymentprocessor;

public abstract class PaymentProcessor {
	abstract Gateway createGateway();

	void pay(int amount) {
		Gateway gateway = createGateway();
		gateway.capture(amount);
	}

}
