package dollar;

/**
 * Bank
 *
 * @author jongUn
 * @since 2016. 08. 12.
 */
public class Bank {
	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}
}
