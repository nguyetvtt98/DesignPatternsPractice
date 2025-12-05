package abstractfactory.checkoutsystem;

import java.math.BigDecimal;

public class USFactory implements RegionFactory {
	@Override
	public TaxCalculator createTaxCalculator() {
		return (net, cart, customer) -> net.multiply(new BigDecimal("0.07"));
	}

	@Override
	public CurrencyFormatter createCurrencyFormatter() {
		return amount -> String.format("USD %s", amount.getAmount());
	}

	@Override
	public InvoiceGenerator createInvoiceGenerator() {
		return (order, taxes, policy)
				-> new Invoice("US", "USD " + order.netTotal().getAmount().add(taxes.taxAmount().getAmount()),
				"US " + order.id());
	}

	@Override
	public ShippingRateService createShippingRateService() {
		return (destination, cart, when) -> Money.of(8 + cart.weightKg() * 0.4, "USD");
	}

	@Override
	public CompliancePolicy createCompliancePolicy() {
		return order -> {};
	}

	@Override
	public String key() {
		return "US";
	}
}
