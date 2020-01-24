package constructors2;

public class ParticuliereKlant extends Klant{
	
	int btwpercentage;

	public ParticuliereKlant(String naam, String voornaam, int btwpercentage) {
		super(naam, voornaam);
		this.btwpercentage = btwpercentage;
		controle(btwpercentage);
	}

	private void controle(int btwpercentage2) {
		
	}

}
