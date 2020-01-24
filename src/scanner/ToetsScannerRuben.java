package scanner;

import java.util.Scanner;

public class ToetsScannerRuben {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ToetsScannerRuben toets1 = new ToetsScannerRuben();
		
		String zin = toets1.leesZin();
		String vervangwoord = toets1.leesVervangwoord();
		
		String resultaat = toets1.replaceWord(vervangwoord, zin);
		System.out.println(resultaat);
		
	}

	private String leesVervangwoord() {
		System.out.println("Welk woord moet er worden vervangen?");
		return scanner.nextLine();
	}

	private String leesZin() {
		System.out.println("Geef een zin in");
		return scanner.nextLine();
	}

	public int findReplaceWord(String vervangwoord, String zin) {
		int position = zin.indexOf(vervangwoord);
		return position;
	}

	public String replaceWord(String vervangwoord, String zin) {
		if (zin.contains(vervangwoord)) {
			//zoek positie
			int positie = findReplaceWord(vervangwoord, zin);
			String eersteGedeelte = zin.substring(0, positie);
			String tweedeGedeelte = zin.substring(positie + vervangwoord.length());
			
			String vervangedeelteSterretjes = "";
			for (int i = 0; i < vervangwoord.length(); i++) {
				vervangedeelteSterretjes = vervangedeelteSterretjes + "*";
			}
			return eersteGedeelte + vervangedeelteSterretjes + tweedeGedeelte;
		}
		return zin;
	}


}
