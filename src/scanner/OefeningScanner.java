package scanner;

import java.util.Scanner;

public class OefeningScanner {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		OefeningScanner os = new OefeningScanner();
		os.readinput();
	}

	private void readinput() {
		System.out.println("Geef aub wat input in:");
		String input = scanner.nextLine();
		System.out.println("De input was: " + input);
	}
	
	private void readinput2() {
		
	}

}
