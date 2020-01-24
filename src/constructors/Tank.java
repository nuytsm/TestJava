package constructors;

public class Tank {
	
	String munitiontype;
	boolean tracks;
	int wheels;
	Cannon cannon;
	int speed;
	boolean amphibious;
	
	public Tank() {
	}
	
	public Tank(boolean amphibious) {
		this.amphibious = amphibious;
	}
	
	public Tank(boolean tracks, boolean amphibious, int speed, Cannon cannon) {
		this(amphibious);
		this.tracks = tracks;
		this.speed = speed;
		this.cannon = cannon;
	}
	
	public Tank(boolean tracks, boolean amphibious, int speed, int wheels, String munitiontype, Cannon cannon) {
		this(tracks, amphibious, speed, cannon);
		this.munitiontype = munitiontype;
		this.wheels = wheels;
	}
	
	@Override
	public String toString() {
		return "Tank: cannon " + this.cannon.calibre + " , speed: " + this.speed;
	}

}
