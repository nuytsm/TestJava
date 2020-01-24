package constructors2;

public class Klant {
	
	boolean irritant;
	Adres adres;
	String naam, voornaam;
	String telefoonnummer;
	String email;
	
//	//default constructor
//	public Klant() {
//	}
	
	//constructor die naam vraagt
	public Klant(String naam, String voornaam) {
		this.naam = naam;
		this.voornaam = voornaam;
	}
	
	public Klant(String naam, String voornaam, boolean irritant) {
		this(naam, voornaam);
		this.irritant = irritant;
	}

}
