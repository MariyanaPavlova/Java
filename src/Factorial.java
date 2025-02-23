

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		long n = sc.nextInt();
		
		long fac = 1;
		for (int i = 1; i <= n; i++) {
//			fac = fac * i;
			fac *= i;
		}

		System.out.println("The factorial is " + fac);
	}

}
