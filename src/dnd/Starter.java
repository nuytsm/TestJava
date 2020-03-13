package dnd;

import dnd.characters.Barbarian;
import dnd.characters.Bard;

public class Starter {
	
	public static void main(String[] args) {
		Unit bart = new Bard("Bart");
		Unit grog = new Barbarian("Grog");
		
		Weapon sword = new Weapon(8);
		Weapon greatsword = new Weapon(12);
		
		bart.weapon = sword;
		grog.weapon = greatsword;
		bart.attack();
		grog.attack();
		
	}
}
