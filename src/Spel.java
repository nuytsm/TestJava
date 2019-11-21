
public class Spel {
	
	public static void main(String[] args) {
		Weapon ak = new Weapon();
		ak.name = "AK47";
		Weapon sniperrifle = new Weapon();
		sniperrifle.name = "Dragunov";
		
		ak.fire();
		sniperrifle.fire();
		sniperrifle.fire();
		
	}

}
