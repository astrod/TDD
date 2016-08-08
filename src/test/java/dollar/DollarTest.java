package dollar;

import org.junit.Assert;
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
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Franc.franc(10), five.times(2));
		assertEquals(Franc.franc(15), five.times(3));
	}

	@Test
	public void testEquality() {
		Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		Assert.assertTrue(Franc.franc(5).equals(Franc.franc(5)));
		Assert.assertFalse(Franc.franc(6).equals(Franc.franc(5)));
		Assert.assertFalse(Franc.franc(5).equals(Money.dollar(5)));
	}

	@Test
	public void testCurrency() {
		Assert.assertEquals("USD", Money.dollar(1).currency());
		Assert.assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testDifferentClassEquality() {
		Assert.assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}
}
