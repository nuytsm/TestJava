package toets1;

public class PrintInterger {
	
	public int number = 5;
	
	public static void main(String[] args) {
		if (3 < 4) {
			System.out.println("Ok, dit print");
		} else {
			System.out.println("Het werkt dus niet");
		}
		PrintInterger printint = new PrintInterger();
		if (printint.number < 6) {
			System.out.println("OK");
		}
		
	}
}
