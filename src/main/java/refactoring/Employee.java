package refactoring;

/**
 * Employee
 *
 * @author jongUn
 * @since 2016. 10. 03.
 */
public class Employee extends Party{
	private String _id;
	private int _annualCost;

	public Employee(String name, String id, int annualCost) {
		super(name);
		_id = id;
		_annualCost = annualCost;
	}

	public String getId() {
		return _id;
	}

	public int getAnnualCost() {
		return _annualCost;
	}

	public int getHeadCount() {
		return 1;
	}
}
