package constructors2;

public class Starter {
	
	public static void main(String[] args) {
		Klant klant1 =  new Klant("sjdfh","kjshf");
		klant1.naam = "van den Broek";
		klant1.voornaam = "Mitch";
		klant1.irritant= true;
		klant1.telefoonnummer = "011589856";
		klant1.email = "mitch@mail.com";
		klant1.adres = new Adres("genebroekstraat", 56);
		
		
		Klant klant2 = new Klant("jhsf","jkhf");
		klant2.irritant= true;
		klant2.telefoonnummer = "011589856";
		klant2.email = "mitch@mail.com";
//		klant2.adres = "adres1";
		
		Klant klant3 = new Klant("De Cap", "Michiel", true);
		System.out.println(klant3.naam);
		
		Klant klant4 = new Klant("De Cap", "Michiel");
		klant4.getAdres().
		
		
		Gemeente lommel = new Gemeente("Lommel", "3920", "Limburg");
		Gemeente sinttruiden = new Gemeente("Sint Truiden", "Limburg");
	}

}
