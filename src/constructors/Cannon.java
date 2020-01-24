package constructors;

import java.util.ArrayList;
import java.util.List;

public class Cannon {
	
	int calibre;
	boolean rifling;
	int maxElevation;
	List<String> munities = new ArrayList<String>();
	
	public Cannon() {
		
	}
	
	public Cannon(int calibre, boolean rifling, int maxElevation) {
		this.calibre = calibre;
		this.maxElevation = maxElevation;
		this.rifling = rifling;
	}
	
	public void addMunition(String munitie) {
		munities.add(munitie);
	}

}
