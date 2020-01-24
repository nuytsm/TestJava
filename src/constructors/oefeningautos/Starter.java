package constructors.oefeningautos;

public class Starter {
	
	public static void main(String[] args) {
		Auto autovangijs = new Auto("gijs");
		autovangijs.kleur = "zwart";
		autovangijs.pk = 90;
		autovangijs.aantalwielen = 4;
		
		Auto autovanklant4 = new Auto("klant4",4,90,"groen");
		System.out.println(autovanklant4.kleur);
		System.out.println(autovanklant4.eigenaar);
		
		
		autovangijs.onderhoudsbeurt(10000);
		autovangijs.onderhoudsbeurt(80000);
		autovangijs.onderhoudsbeurt(120000);
		
		System.out.println(autovangijs.onderhoudsbeurten.size());
		
	}

}
