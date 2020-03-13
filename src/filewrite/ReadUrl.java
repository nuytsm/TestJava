package filewrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadUrl {
	
	private void readUrl() throws IOException {
		URL siteurl = new URL("http://www.google.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(siteurl.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
        	if (inputLine.contains(".js")) {
        		System.out.println(inputLine);        		
        	}
        in.close();
       
	}
	
	public static void main(String[] args) {
		ReadUrl readUrl = new ReadUrl();
		try {
			readUrl.readUrl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
