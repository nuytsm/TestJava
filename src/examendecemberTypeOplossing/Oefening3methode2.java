package examendecemberTypeOplossing;

public class Oefening3methode2 {
	String zin = "Zin een. Zin twee? Zin drie!";

	public static void main(String args[]) {
		Oefening3methode2 exec = new Oefening3methode2();
		exec.splitTekst();
	}

	public void splitTekst() {
		for (int i = 0; i < zin.length(); i++) {
			char charAt = zin.charAt(i);
			System.out.print(charAt);
			if (isZinEinde(charAt)) {
					if (i > zin.length()-2) {
						return;
					}
					System.out.print(zin.charAt(i + 1));
					System.out.println();
				i++;
			}
		}
	}

	private boolean isZinEinde(char charAt) {
		return charAt == '.' || charAt == '!' || charAt == '?';
	}
}
