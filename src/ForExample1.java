

import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dai chislo be: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.print(number + " ");
		}
	}

}
