
public class Calculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int resultaat = calc.add(4, 8);
//		System.out.println(resultaat);
//		resultaat = calc.add(1452, 546843);
//		System.out.println(resultaat);
		System.out.println(calc.divide(5, 2));
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int divideintegers(int a, int b) {
		return a/b;
	}
	
	public double divide(double a, double b) {
		return a/b;
	}
}
