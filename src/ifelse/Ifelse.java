package ifelse;

public class Ifelse {
	
	
	public static void main(String[] args) {
		Ifelse ifelse = new Ifelse();
		
		ifelse.printMyarray();
	}
	
	public void constructArray() {
		int[] sld = new int[4];
		sld[0] = 455481;
		sld[1] = 25;
		sld[2] = 958;
		sld[3] = 12;
		
		int[] sld2 = {45,258,2569,254,2};
		
		
		
		
	}
	
	public boolean controlCalculation(double a, double b, double c, String s) {
		if((a > -100 && a < 0) && (b > 40 && b <50) || s.length() < 5) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	public void printMyarray() {
		int[] x = new int[10];
		for (int a : x) {
			System.out.println("item: " + a);
		}
	}
	
	

}
