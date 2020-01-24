package games;

import java.util.ArrayList;
import java.util.List;

public class Boogschutter {
	int hitpoints;
	
	public Boogschutter() {
	}
	
	public Boogschutter(int aantal) {
		this.hitpoints = aantal;
	}

	
	public static void main(String[] args) {
		
	
		Boogschutter sc = new Boogschutter(100);
//		Boogschutter sc2 = new Boogschutter(100);
//		Boogschutter sc3 = new Boogschutter(100);
//		System.out.println(sc.hitpoints);
//		Kruisboogschutter subc = new Kruisboogschutter(110,10);
//		subc.extradamage = 10;
//		Kruisboogschutter subc2 = new Kruisboogschutter(110,10);
//		subc2.extradamage = 10;
//		Kruisboogschutter subc3 = new Kruisboogschutter(100, 0);
//		subc.print();
//		Kruisboogschutter subc4 = new Kruisboogschutter();
		
		List<Kruisboogschutter> schutters = sc.maakVeelKruisboogschutters(5000);
		System.out.println(schutters);
	}
	
	public List<Kruisboogschutter> maakVeelKruisboogschutters(int aantal){
		List<Kruisboogschutter> schutters = new ArrayList<Kruisboogschutter>();
		for (int i = 0; i < aantal; i++) {
			schutters.add(new Kruisboogschutter(100));
		}
		return schutters;
	}
	
}
