package swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
	File planets = new File("U:\\eclipse-workspace\\TestJava\\src\\planets\\planets.csv");
	
	public String read() {
		try {
			String result = "";
			Scanner scanner = new Scanner(planets);
			while(scanner.hasNext()) {
				result += scanner.nextLine() + "\n";
			}
			scanner.close();
			return result;
			
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, bestand niet gevonden");
			e.printStackTrace();
		}
		return "Error reading file";
	}
	
	public void writeToFile() {
//		FileWriter fileWriter = new FileWriter(planets);
		System.out.println("We slaan het bestand op");
	}

}
