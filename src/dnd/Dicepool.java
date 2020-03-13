package dnd;

import java.util.ArrayList;
import java.util.List;

public class Dicepool {
	
	List<Dice> dices = new ArrayList<>();
	
	
	public int roll() {
		int sucessen = 0;
		for (Dice dice : dices) {
			if (5 < (int)dice.roll()) {
				sucessen++;
			}
		}
		return sucessen;
	}

}
