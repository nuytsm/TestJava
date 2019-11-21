package toets1;

public class Unit {
	
	public int hitpoints = 100;
	
	public void hit() {
		if (this.hitpoints < 0) {
			System.out.println("Speler dood");
		} else {
			this.hitpoints = this.hitpoints - 50;
			System.out.println("Speler hitpoints: " + this.hitpoints);
		}
		
	}

}
