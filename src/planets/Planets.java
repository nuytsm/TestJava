package planets;

public class Planets {
	
	public static final double EARTH_ORBITAL_PERIOD = 365.256363004 * 24;
	public static final double EARTH_DISTANCE_TO_SUN = 149600000;
	
	
	
	public static double calculateOrbitalSpeed(double orbitalPeriod, double orbitalDistance) {
		double distance = 2 * Math.PI * orbitalDistance;
		return distance / orbitalPeriod;
	}
	
	public static void main(String[] args) {
		double resultEarth = Planets.calculateOrbitalSpeed(Planets.EARTH_ORBITAL_PERIOD, Planets.EARTH_DISTANCE_TO_SUN);
		System.out.println(resultEarth);
		
	}
	
	

}
