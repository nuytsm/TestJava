package dnd;

public class Weapon {
	
	public String name;
	public int sterkte;
//	public Dice[] dices = new Dice[5];
//	
	public Weapon(int sterkte) {
		this.sterkte = sterkte;
	}
	
	
	public int hit() {
		double roll = Math.floor(Math.random() * sterkte);
		
		return (int)roll;
	}

}
