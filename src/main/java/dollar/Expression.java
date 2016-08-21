package dollar;

/**
 * Expression
 *
 * @author jongUn
 * @since 2016. 08. 12.
 */
public interface Expression {
	Money reduce(Bank bank, String to);

	Expression plus(Expression tenFrancs);

	Expression times(int multiplier);
}
