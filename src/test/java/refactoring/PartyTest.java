package refactoring;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * PartyTest
 *
 * @author jongUn
 * @since 2016. 10. 03.
 */
public class PartyTest {
	@Test
	public void testComposite() {
		// init Employee
		Employee emp1 = new Employee("Jon", "1", 100);
		Employee emp2 = new Employee("Bob", "2", 200);
		Employee emp3 = new Employee("Test", "3", 300);
		Employee emp4 = new Employee("Con", "4", 400);

		// init Department
		Department dep1 = new Department("HR");
		Department dep2 = new Department("IT");
		Department dep3 = new Department("EDU");

		// composite emp
		dep2.addParty(emp1);
		dep2.addParty(emp2);
		dep2.addParty(emp3);

		dep3.addParty(emp4);

		dep1.addParty(dep2);
		dep1.addParty(dep3);

		// verify
		assertEquals(dep1.getAnnualCost(), 1000);
		assertEquals(dep1.getHeadCount(), 4);

	}
}