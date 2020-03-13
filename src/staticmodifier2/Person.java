package staticmodifier2;

public class Person {
	
	public String name;
	public static int x = 0;
	
	public Person(String name) {
		this.name = name;
		x+=1;
	}
	
	public static void main(String[] args) {
		Person x1 = new Person("Lennert");
		System.out.println(Person.x);
		Person x2 = new Person("Michiel");
//		x2.x = 10;
		System.out.println(Person.x);
		Person x3 = new Person("Mitch");
		System.out.println(Person.x);
		
	}

}
