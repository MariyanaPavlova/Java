package arrays;

import java.util.Arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        //copy from array, the method documentation can be found on the link below
        // https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);


        //printing an array
        System.out.println(Arrays.toString(copyTo));


        char[] caffein = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(Arrays.toString(caffein));

        //printing it manually
        for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

        char[] resultArray = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(Arrays.toString(resultArray));
    }
}
