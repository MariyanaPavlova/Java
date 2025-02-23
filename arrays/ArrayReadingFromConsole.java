package arrays;




import java.util.Arrays;
import java.util.Scanner;

public class ArrayReadingFromConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value:");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


		String arrayStringValue = Arrays.toString(arr);
		System.out.println(arrayStringValue);
		System.out.println("------");
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(arr));
		System.out.println("------");

		int[] values = new int[50];
		Arrays.fill(values, 7);
		System.out.println(Arrays.toString(values));



	}
}
