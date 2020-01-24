package scanner;

import java.util.Scanner;

public class ScannerReadArray {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ScannerReadArray readArray = new ScannerReadArray();
		int[] inputarray = readArray.readArrayInput();
		int product = readArray.readProduct();
		int[] resultarray = readArray.processInput(inputarray, product);
		readArray.printResultArray(resultarray);
	}

	private void printResultArray(int[] resultarray) {
		for (int i = 0; i < resultarray.length; i++) {
			System.out.print(resultarray[i]);
			if (i < resultarray.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	private int[] processInput(int[] inputarray, int product) {
		int[] result = new int[inputarray.length];
		for (int i = 0; i < inputarray.length; i++) {
			result[i] = inputarray[i] * product;
		}
		return result;
	}

	private int readProduct() {
		System.out.println("Geef het product in:");
		String input = scanner.nextLine();
		return Integer.parseInt(input);
	}

	private int[] readArrayInput() {
		System.out.println("Geef de array in:");
		String arrayAsString = scanner.nextLine();
		return splitToIntArray(arrayAsString);
	}

	private int[] splitToIntArray(String arrayAsString) {
		String[] split = arrayAsString.split("\\D+");
		int[] result = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			result[i] = Integer.parseInt(split[i]);
		}
		return result;
	}

}
