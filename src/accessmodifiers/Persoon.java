package accessmodifiers;

public class Persoon {
	
	private String naam;
	private String voornaam;
	private boolean man;
	private String rrn;
	
	public Persoon(String naam, boolean man, String rrn) {
		this.naam = naam;
		this.man = man;
		this.rrn = rrn;
	}
	
	public String getVolledigeNaam() {
		return naam + " " + voornaam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public boolean isMan() {
		return man;
	}

	public void setRrn(String rrn) {
		if (Integer.parseInt(String.valueOf(rrn.charAt(rrn.length()-1))) % 2 == 0 && man) {
			return;
		}
		this.rrn = rrn;
	}
	

}
