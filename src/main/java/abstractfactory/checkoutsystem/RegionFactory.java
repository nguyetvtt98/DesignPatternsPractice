package abstractfactory.checkoutsystem;

public interface RegionFactory {
	TaxCalculator createTaxCalculator();
	CurrencyFormatter createCurrencyFormatter();
	InvoiceGenerator createInvoiceGenerator();
	ShippingRateService createShippingRateService();
	CompliancePolicy createCompliancePolicy();
	String key();
}
