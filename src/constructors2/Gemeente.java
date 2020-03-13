package constructors2;

public class Gemeente {
	
	String naam;
	String postcode;
	String provincie;
	
	public Gemeente(String naam, String provincie) {
		this.naam = naam;
		this.provincie = provincie;
	}

	public Gemeente(String postcode) {
		super();
		this.postcode = postcode;
	}

	public Gemeente(String naam, String postcode, String provincie) {
		this(naam, provincie);
		this.postcode=postcode;
	}
}
