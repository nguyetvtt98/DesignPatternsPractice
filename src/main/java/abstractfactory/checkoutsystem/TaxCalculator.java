package abstractfactory.checkoutsystem;

public interface TaxCalculator {
	Money compute(Money net, Cart cart, Customer customer);
}
