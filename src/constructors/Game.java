package constructors;

public class Game {
	
	public static void main(String args[]) {
		Tank t1 = new Tank(true, false, 200, new Cannon(120,false,60));
//		t1.tracks = true;
//		t1.amphibious = false;
//		t1.calibre = 200;
//		t1.speed = 50;
		
		Tank t2 = new Tank();
		t2.tracks = false;
		t2.amphibious = true;
		t2.speed = 112;
		
		System.out.println(t1);
	}
		
}
