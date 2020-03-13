package staticmodifier;

public class StaticVariable {
	
	final static int aantal = 0;
	
	
	
	public static void main(String[] args) {
		StaticVariable instantie1 = new StaticVariable();
		System.out.println("Intantie1: " + instantie1.aantal);
		
		StaticVariable instantie2 = new StaticVariable();
//		instantie2.aantal = 5;
		System.out.println("Intantie2: " + instantie2.aantal);
		StaticVariable instantie3 = new StaticVariable();
		System.out.println("Intantie3: " + instantie3.aantal);
		StaticVariable instantie4 = new StaticVariable();
		System.out.println("Intantie4: " + instantie4.aantal);
		
	}

}
