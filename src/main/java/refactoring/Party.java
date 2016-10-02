package refactoring;

/**
 * Party
 *
 * @author jongUn
 * @since 2016. 10. 03.
 */
public abstract class Party {
	private String _name;

	abstract public int getAnnualCost();
	abstract public int getHeadCount();

	public String getName() {
		return _name;
	}

	protected Party(String name) {
		_name = name;
	}
}
