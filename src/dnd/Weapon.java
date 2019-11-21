package dnd;

public class Weapon {
	
	public String name;
	public Dice[] dices = new Dice[5];
	
	public int hit() {
		int rollresult = 0;
		for (int i = 0; i < dices.length; i++) {
			rollresult += dices[i].roll();
		}
		return rollresult;
	}

}
