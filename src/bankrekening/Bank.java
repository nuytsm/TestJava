package bankrekening;

public class Bank {
	
	public static void main(String[] args) {
		Bankrekening zichtrekening = new Bankrekening();
		System.out.println(zichtrekening.bedrag);
		zichtrekening.addMoney(80.0);
		System.out.println(zichtrekening.bedrag);
		zichtrekening.addMoney(140.0);
		System.out.println(zichtrekening.bedrag);
		
		Bankrekening zichtrekeningBijArgenta =  new Bankrekening();
		System.out.println("Rekening bedrag argenta: " + zichtrekeningBijArgenta.bedrag);
	}

}
