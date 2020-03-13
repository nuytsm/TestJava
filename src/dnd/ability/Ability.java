package dnd.ability;

public class Ability {
	
	int waarde;
	
	public boolean execute() {
		if (waarde < 10) {
			//fail
			return false;
		}
		return true;
	}

}
