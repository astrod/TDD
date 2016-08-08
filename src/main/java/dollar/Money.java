package dollar;

/**
 * Money
 *
 * @author jongUn
 * @since 2016. 08. 04.
 */
public class Money {
	protected int amount;
	protected String currency;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency);
	}

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public String currency() {
		return this.currency;
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
