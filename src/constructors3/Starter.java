package constructors3;

public class Starter {
	
	public static void main(String[] args) {
		Person person1 = new Person("Mitch", "Van den broek");
		
//		System.out.println(person1.naam);
		Person person2 = new Person();
		
		Employee emp1 = new Employee("Bavo", 1500);
		System.out.println(emp1.naam + " salaris:" + emp1.salaris);
		Employee emp2 = new Employee("Michiel");
		
	}

}
