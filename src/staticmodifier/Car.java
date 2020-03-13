package staticmodifier;

public class Car {
	
	double sensorrotationwheels;
//	Math mathlibrary =  new Math();
	
	public double calculatespeed() {
//		System.out.println(mathlibrary.pi * 9.5);
//		mathlibrary.pi = 9.56586;
//		Math.pi = 98968.2563;
		return  Math.product(sensorrotationwheels, Math.pi * 54.5);
	}

}
