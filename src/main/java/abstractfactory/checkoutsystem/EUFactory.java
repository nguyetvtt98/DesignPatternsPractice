package abstractfactory.checkoutsystem;

import java.math.BigDecimal;

public class EUFactory implements RegionFactory {
	@Override
	public TaxCalculator createTaxCalculator() {
		return (net, cart, customer) -> net.multiply(customer.business() ? new BigDecimal("0") : new BigDecimal("0.2"));
	}

	@Override
	public CurrencyFormatter createCurrencyFormatter() {
		return amount -> String.format("EUR %s", amount.getAmount());
	}

	@Override
	public InvoiceGenerator createInvoiceGenerator() {
		return ((order, taxes, policy) ->
				new Invoice("EU", "EUR " + order.netTotal().getAmount().add(taxes.taxAmount().getAmount()),
						"EU-" + order.id()));
	}

	@Override
	public ShippingRateService createShippingRateService() {
		return ((destination, cart, when) -> Money.of(5 + cart.weightKg() * 0.5, "EUR"));
	}

	@Override
	public CompliancePolicy createCompliancePolicy() {
		return order -> {
			if (order.customer().business() && (order.customer().vatId() == null
					|| order.customer().vatId().isBlank())) {
				throw new ComplianceException("EU VAT ID required");
			}
		};
	}

	@Override
	public String key() {
		return "EU";
	}
}
