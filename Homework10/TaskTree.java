package Homework10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskTree {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        //Решение с Array
//        int [] nums = new int[5];
//        int [] numbers = new int[5];
//
//        for (int i=1; i<=5; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Въведете " + (i) + " елемент:");
//            nums[i-1] = (scanner.nextInt());
//        }
//
//        for (int i=0; i<5; i++) {
//            if (nums[i] == nums[nums.length-1 - i]){
//                numbers[i] = nums[i];
//            }
//        }
//
//        if (Arrays.equals(nums, numbers))
//            System.out.println("Колекцията е огледална");
//        else
//            System.out.println("Колекцията не е огледална");
//   }
//}
        //Решение с ArrayList
        List<Integer> number1 = new ArrayList<>(5);
        List<Integer> number2 = new ArrayList<>(5);

        for (int i=1; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Въведете " + i + " елемент:");
            number1.add(scanner.nextInt());
        }
        for (int i : number1) { //върти през числата
            int n;
            n = number1.indexOf(i); //взимаме индекса на числото
            if (i == number1.get(4-n)){
                number2.add(i);
            }
        }
        if (number1.equals(number2))
            System.out.println("Колекцията е огледална");
        else
            System.out.println("Колекцията не е огледална");

    }
}