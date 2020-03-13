package staticmodifier2;

public class Car {
	
	double wielstraal;
	double sensorwieldraaing;
	
	public double berekenSnelheid() {
//		Math mathlibrary = new Math();
		double wielomtrek = Math.berekenOmtrek(wielstraal);
		Math.pi = 89;
		return wielomtrek * sensorwieldraaing;
	}
	

}
