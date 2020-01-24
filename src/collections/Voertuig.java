package collections;

public class Voertuig {
	
	boolean gemotoriseerd;
	double maxsnelheidkmh;
	
	public Voertuig() {
		System.out.println("wordt aangemaakt");
	}
	
	public Voertuig(boolean gemotoriseerd) {
		this();
		this.gemotoriseerd = gemotoriseerd;
	}
	
	public Voertuig(boolean gemotoriseerd, int maxsnelheidmph) {
		this(gemotoriseerd);
		this.maxsnelheidkmh = maxsnelheidmph * 1.6;
	}
	
	public static void main(String[] args) {
//		Voertuig vtg = new Voertuig(true, 200);
//		Voertuig vtg2 = new Voertuig(false, 40);
//		Voertuig vtg3 = new Voertuig(true, 75);
//		Voertuig vtg4 = new Voertuig(true);
//		Voertuig alienvtg = new Voertuig();
		
		Voertuig vtg5 = new Vliegtuig(true, 500);
		
//		new Vliegtuig();
		
		System.out.println(vtg5.maxsnelheidkmh);
//		System.out.println(vtg2.gemotoriseerd);
	}

}
