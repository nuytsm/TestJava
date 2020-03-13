package dnd.characters;

import dnd.Unit;

public class Bard extends Unit{
	
	public Bard(String naam) {
		this.name = naam;
	}
	
	public int attack() {
		int hit = weapon.hit();
		System.out.println(name + " Double Attack -> points: " + 2*hit);
		return hit;
	}
	

}
