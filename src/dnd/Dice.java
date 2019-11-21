package dnd;

import java.util.Random;

public class Dice {
	
	public int diceFaces = 0;
	
	public int roll() {
		Random random = new Random();
		return random.nextInt(diceFaces);
	}

}
