package factorymethod.paymentprocessor;

public class PaymentService {
	public void doPayment(PaymentProcessor paymentProcessor, int amount) {
		paymentProcessor.pay(amount);
	}
}
