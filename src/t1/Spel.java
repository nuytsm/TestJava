package t1;

public class Spel {
	
	public static void main(String[] args) {
		Unit unit1 = new Unit();
		unit1.name = "boris";
		
		Unit hhe = new Unit();
		hhe.name = "hhhhhheeeee";
		
		
		unit1.hit();
		unit1.hit();
		unit1.hit();
		unit1.hit();
		unit1.hit();
		
		Medic medic1 = new Medic();
		medic1.heal(unit1, 30);
		medic1.heal(hhe, 20);
		
	}

}
