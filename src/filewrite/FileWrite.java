package filewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileWrite {
	
	public static void main(String[] args) {
		File file = new File("U:\\eclipse-workspace\\TestJava\\src\\filewrite\\file.txt");
		try {
			FileWriter writer = new FileWriter(file, Charset.defaultCharset(), true);
			for (int i = 0; i < 100; i++) {
				writer.write(""+i);
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
