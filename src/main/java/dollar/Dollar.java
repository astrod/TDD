package dollar;

/**
 * Dollar
 *
 * @author jongUn
 * @since 2016. 08. 03.
 */
public class Dollar extends Money{

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}


}
