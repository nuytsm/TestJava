package constructors.oefeningautos;

import java.util.ArrayList;
import java.util.List;

public class Auto extends Transport{
	
	int aantalwielen;
	int pk;
	String kleur;
	List<OnderhoudsBeurt> onderhoudsbeurten = new ArrayList<OnderhoudsBeurt>();
	
	public Auto(String eigenaar){
		super(eigenaar);
	}

	public Auto(String eigenaar, int wielen, int pk, String kleur) {
		super(eigenaar);
		this.aantalwielen = wielen;
		this.pk = pk;
		this.kleur = kleur;
	}
	
	public void onderhoudsbeurt(int km) {
		onderhoudsbeurten.add(new OnderhoudsBeurt(km));
	}
}
