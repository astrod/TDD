package refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * Department
 *
 * @author jongUn
 * @since 2016. 10. 03.
 */
public class Department extends Party{
	private List<Party> partyList = new ArrayList<Party>();

	public Department(String name) {
		super(name);
	}

	public int getAnnualCost() {
		int result = 0;
		for(Party party : partyList) {
			result += party.getAnnualCost();
		}

		return result;
	}

	public int getHeadCount() {
		int result = 0;
		for(Party party : partyList) {
			result += party.getHeadCount();
		}
		return result;
	}

	public void addParty(Party party) {
		partyList.add(party);
	}
}
