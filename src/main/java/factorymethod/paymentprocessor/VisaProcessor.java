package factorymethod.paymentprocessor;

public class VisaProcessor extends PaymentProcessor {
	@Override
	Gateway createGateway() {
		return new VisaGateway();
	}
}
