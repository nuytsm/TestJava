package dnd;

public class Unit {
	
	protected String name;
	Apparel[] clothing = new Apparel[5];
	protected Weapon weapon;
	
	public int attack() {
		int hit = weapon.hit();
		System.out.println(name + " Attack -> points: " + hit);
		return hit;
	}

}
