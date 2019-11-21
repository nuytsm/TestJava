package t1;

public class Medic {
	
	public void heal(Unit a, int hitpointsToHeal) {
		a.hitpoints = a.hitpoints + hitpointsToHeal;
		System.out.println("I healed unit " + a.name + " for " + hitpointsToHeal + " hitpoints, unit has now: " + a.hitpoints +" hitpoints");
	}

}
