package dollar;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * DollarTest
 *
 * @author jongUn
 * @since 2016. 08. 03.
 */

public class DollarTest {
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
}
