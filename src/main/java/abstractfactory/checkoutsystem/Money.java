package abstractfactory.checkoutsystem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
	 private final BigDecimal amount;
	 private final String currency;

	 public Money(BigDecimal amount, String currency) {
		 this.amount = amount.setScale(2, RoundingMode.HALF_UP);
		 this.currency = Objects.requireNonNull(currency);
	 }

	 public static Money of(double v, String c) {
		 return new Money(BigDecimal.valueOf(v), c);
	 }

	public BigDecimal getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public Money add(Money money) {
		 if (!currency.equals(money.getCurrency())) {
			 throw new IllegalArgumentException("Currency mismatch");
		 }
		 return new Money(amount.add(money.getAmount()), money.getCurrency());
	}

	public Money multiply(BigDecimal x) {
		 return new Money(amount.multiply(x), currency);
	}

	@Override
	public String toString() {
		return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
	}
}
