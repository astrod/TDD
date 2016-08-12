package dollar;

/**
 * Expression
 *
 * @author jongUn
 * @since 2016. 08. 12.
 */
public interface Expression {
	Money reduce(String to);
}
