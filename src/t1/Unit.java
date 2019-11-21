package t1;

public class Unit {
	
	public int hitpoints = 100;
	public String name = "";
	
	public boolean hit() {
		hitpoints = hitpoints - 25;
		if (hitpoints <= 0) {
			System.out.println("Unit " + name + " is dood.");
			hitpoints = 0;
			return true;
		} else {
			System.out.println("Unit " + name + " is geraakt, hitpoints:" + hitpoints);
			return false;
		}
		
	}

}
