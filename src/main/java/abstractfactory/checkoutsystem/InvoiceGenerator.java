package abstractfactory.checkoutsystem;

public interface InvoiceGenerator {
	Invoice generate(Order order, TaxBreakdown taxes, CompliancePolicy policy);
}
