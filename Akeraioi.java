package akeraioi;

import java.util.Scanner;

public class Akeraioi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert an integer: ");
		int num1 = scan.nextInt();
		System.out.print("Please insert the second number: ");
		int num2 = scan.nextInt();
		int result = akeraioi(num1, num2);
			
			System.out.printf("The final result is: %d\n", result);
	}
	
		public static int akeraioi(int x, int y) {
			int result;
			if(x > 0) {
				return result = x + y;
			}
			else {
				return x - y;
			}
		}
}