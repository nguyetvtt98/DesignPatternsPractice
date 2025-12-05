package abstractfactory.checkoutsystem;

public interface CompliancePolicy {
	void validateBeforePay(Order order) throws ComplianceException;
}
