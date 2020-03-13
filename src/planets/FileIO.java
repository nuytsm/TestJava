package planets;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileIO {
	
	public static void main(String[] args) {
		Path myfilepath = Paths.get("U:\\eclipse-workspace\\TestJava\\src\\planets\\planets.csv");
		try (BufferedWriter writer = Files.newBufferedWriter(myfilepath, StandardOpenOption.APPEND)){
			writer.append("\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("Error with the file");
			e.printStackTrace();
		} 
		
	}

}
