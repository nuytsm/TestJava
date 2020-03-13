package planets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInput {
	
	public static void main(String[] args) {
		File myfile = new File("U:\\eclipse-workspace\\TestJava\\src\\planets\\planets.csv");
		try {
			Scanner myscanner = new Scanner(myfile);
			
			while (myscanner.hasNext()) {
				System.out.println(myscanner.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
