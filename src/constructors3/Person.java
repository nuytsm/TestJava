package constructors3;

public class Person {
	
	String naam, achternaam;
	
	public Person() {
		
	}
	
	public Person(String naam){
		this.naam = naam.toUpperCase();
	}
	
	public Person(String naam, String achternaam){
		this(naam);
		this.achternaam = achternaam;
	}

}
