package factorymethod.paymentprocessor;

public interface Gateway {
	boolean authorize(int amount);
	void capture(int amount);
}
