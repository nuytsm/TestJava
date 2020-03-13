package collections;

public class Vliegtuig extends Voertuig{
	
	boolean dubbeldekker;
	
	public Vliegtuig(boolean motorised, int mph) {
		super(motorised, mph);
	}
	
	public Vliegtuig maakdubbeldekker(boolean dubbeldekker, int aantalpasagiers) {
		Vliegtuig v = new Vliegtuig(true, 500);
		v.dubbeldekker = dubbeldekker;
		return v;
	}

}
