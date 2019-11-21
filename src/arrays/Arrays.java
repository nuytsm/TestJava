package arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
	
	public static void main(String[] args) {
		Arrays arrays = new Arrays();
		arrays.createMatrix();
//		String omgedraaidestring = arrays.reverseString("Dit is een zin");
//		System.out.println(omgedraaidestring);
//		omgedraaidestring = arrays.reverseString("Dit dfgsdfgzin");
//		System.out.println(omgedraaidestring);
//		omgedraaidestring = arrays.reverseString("Ditqsdfhsffghetiuzin");
//		System.out.println(omgedraaidestring);
//		omgedraaidestring = arrays.reverseString("Dituyiruiin");
//		System.out.println(omgedraaidestring);
//		omgedraaidestring = arrays.reverseString("Dit i456453453n");
//		System.out.println(omgedraaidestring);
	}
	
//	public String reverseString(String a) {
//		char[] array = new char[a.length()];
//		for (int i =0;i<a.length();i++) {
//			
//		}
//		return "";
//	}
	
	public void createMatrix() {
		double[][] matrix = new double[50][10];
		
		int[] a = new int[2];
		int[] b = new int[2];
		int[][] matrixc = {
				{1,2,3,4},
				{4,5,5,6}
		};
	
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		
	}
	
	
	

}
