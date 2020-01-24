package examendecemberTypeOplossing;

public class Oefening3 {
	
	private String zin = "zin een. zin twee. zin drie? zin vier!";
	
	public static void main(String[] args) {
		Oefening3 oef = new Oefening3();
		oef.splitZin();
	}

	private void splitZin() {
		String[] split = zin.split("\\s");
//		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			System.out.print(" " + split[i]);
			if (containsEnding(split[i])) {
				System.out.println();
			}
		}
	}
	
	private boolean containsEnding(String woord) {
		if (woord.endsWith(".") || woord.endsWith("?") || woord.endsWith("!")) {
			return true;
		}
		return false;
	}

}
