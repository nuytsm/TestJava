package scanner;

import java.util.Scanner;

public class OefScanner2 {
	public static void main (String[]args) {
		
		OefScanner2 oefScanner = new OefScanner2();
		String input = oefScanner.readinput();
		double resultaat = oefScanner.bewerking(input);
		System.out.println("Het resultaat is: " + resultaat);
		
		String doublealsString = "2cb.0";
		double mijngetal = Double.parseDouble(doublealsString);
		
	}

	private double bewerking(String calc) {
			
		if (calc.contains("+")) {
			int s = calc.indexOf("+");
			double eersteDouble = firstDouble(calc, s);
			double laatsteDouble = secondDouble(calc, s);
			double resultaat = eersteDouble+laatsteDouble;
			return resultaat;
		}
		else if (calc.contains("-")) {
			int s = calc.indexOf("-");
			double eersteDouble = firstDouble(calc, s);
			double laatsteDouble = secondDouble(calc, s);
			double resultaat = eersteDouble-laatsteDouble;
			return resultaat;
		}
		else if (calc.contains("*")) {
			int s = calc.indexOf("*");
			double eersteDouble = firstDouble(calc, s);
			double laatsteDouble = secondDouble(calc, s);
			double resultaat = eersteDouble*laatsteDouble;
			return resultaat;
		}
		else if (calc.contains("/")) {
			int positie = calc.indexOf("/");
			double eersteDouble = firstDouble(calc, positie);
			double laatsteDouble = secondDouble(calc, positie);
			double resultaat = eersteDouble/laatsteDouble;
			return resultaat;
		}
		System.out.println("Error, geen bewerking gevonden.");
		return 0.0;

	}

	private double secondDouble(String calc, int s) {
		String b = calc.substring(s+1);
		double bb = Double.parseDouble(b);
		return bb;
	}

	private double firstDouble(String calc, int s) {
		String a = calc.substring(0, s);
		double aa = Double.parseDouble(a);
		return aa;
	}

	private String readinput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter calculation");
		String nextLine = scanner.nextLine();
		scanner.close();
		return nextLine;
	}
}