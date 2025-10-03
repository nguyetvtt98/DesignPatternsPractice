package factorymethod.paymentprocessor;

public class PaypalProcessor extends PaymentProcessor {
	@Override
	Gateway createGateway() {
		return new PaypalGateway();
	}
}
