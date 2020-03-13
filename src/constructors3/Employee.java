package constructors3;

public class Employee extends Person{
	
	int salaris = 2000;
	
	public Employee(String naam) {
		super(naam);
	}
	
	public Employee(String naam, String achternaam) {
		super(naam, achternaam);
	}
	
	public Employee(String naam, int salaris) {
		super(naam);
		this.salaris = salaris;
	}
	
	public Employee(int salaris) {
		this.salaris = salaris;
	}
	
	public Employee(String naam, String achternaam, int salaris) {
		this(naam, achternaam);
		this.salaris = salaris;
	}
	

}
