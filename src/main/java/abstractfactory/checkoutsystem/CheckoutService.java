package abstractfactory.checkoutsystem;

import java.time.Instant;

public class CheckoutService {

	private final RegionFactory regionFactory;

	public CheckoutService(RegionFactory regionFactory) {
		this.regionFactory = regionFactory;
	}

	public Invoice checkout(Order order, Cart cart, Address address) {
		var tax = regionFactory.createTaxCalculator();
		var taxes = new TaxBreakdown(tax.compute(order.netTotal(), cart, order.customer()),  "regional-tax");
		regionFactory.createCompliancePolicy().validateBeforePay(order);
		var ship = regionFactory.createShippingRateService().quote(address, cart, Instant.now());
		var total = order.netTotal().add(taxes.taxAmount()).add(ship);
		var format = regionFactory.createCurrencyFormatter();

		return regionFactory.createInvoiceGenerator().generate(order, taxes,
				regionFactory.createCompliancePolicy());
	}
}
