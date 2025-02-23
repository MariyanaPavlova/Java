package arrays;


import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {
		int[] array = {2, 3, 44, 10};
		int[] array2 = {2, 3, 4, 10};

		// THIS COMPARES THE ADDRESSES OF THE REFERENCES AND NOT THE ACTUAL VALUES OF THE ARRAYS, IT WILL ALWAYS BE FALSE in the current code
		if(array == array2) {
			System.out.println("they are equal");
		} else {
			System.out.println("they are not");
		}

		//manual check if the two arrays are equal
		boolean isEqual = true;

		for (int i = 0; i < array.length; i++) {
			if(array[i] != array2[i]) {
				isEqual = false;
				break;
			}
		}

		System.out.println("The arrays are equals:" + isEqual);

		//the quick way
		boolean theResultIfTheTwoArraysAreEqual = Arrays.equals(array, array2);
		System.out.println("theResultIfTheTwoArraysAreEqual = " + theResultIfTheTwoArraysAreEqual);

		System.out.println(Arrays.equals(array, array2));

		int[] otherArray = new int[10];
		Arrays.fill(otherArray, 7);
		System.out.println(Arrays.toString(otherArray));

	}
}
