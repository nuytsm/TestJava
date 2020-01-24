package toets1;

import java.util.Scanner;

public class Toets1 {
		public static void main(String[] args) {
			Toets1 praktijk = new Toets1();
	      		int[] array = new int[]{1, 2, 3, 4, 5};
			praktijk.printarray();		
		}
		private void printarray(){
			for(int i = 0; i < 5; i++){
				System.out.println(array[i]);
			}
		}
	}
}
