package games;

public class Kruisboogschutter extends Boogschutter{
	
	int extradamage = 50;
	
	public Kruisboogschutter() {
		super(80);
	}
	
	public Kruisboogschutter(int hitpoints) {
		super(hitpoints);
	}
	
	public Kruisboogschutter(int hitpoints, int extradamage) {
		this(hitpoints);
		this.extradamage = extradamage;
	}
	
	public void print() {
		System.out.println(this.hitpoints);
	}

}
