package constructors2;

public class Klant {
	
	private boolean irritant;
	private Adres adres;
	private String naam, voornaam;
	private String telefoonnummer;
	private String email;
	
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

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		if (adres.gemeente.postcode.length() != 4 ) {
			return;
		}
		this.adres = adres;
	}

	public boolean isIrritant() {
		return irritant;
	}

	public void setIrritant(boolean irritant) {
		this.irritant = irritant;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNaam() {
		return naam;
	}

	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	
	

}
