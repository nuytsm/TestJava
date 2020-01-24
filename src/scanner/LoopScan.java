package scanner;

import java.util.Scanner;

public class LoopScan {
	
	private Scanner scanner = new Scanner(System.in);
	int[] inputarray = new int[5];
	public static void main (String[]args) {
		LoopScan execute = new LoopScan();
		execute.multiplier();
	}
	public void multiplier() {

		System.out.println("geef getallen in:");
		String numbers = scanner.nextLine();
		System.out.println(numbers);
		int split = numbers.indexOf(" ");
		System.out.println(split);
//		System.out.println(Integer.parseInt(numbers.substring(0, split)));
		for (int i = 0; i < inputarray.length; i++) {
			System.out.println("time: " + i);
			inputarray[i]= Integer.parseInt(numbers.substring(0, split));
			numbers = numbers.substring(split+1);
		}
		
		for (int k = 0; k < inputarray.length; k++) {
			System.out.println(inputarray[k]);
		}
	}
}

