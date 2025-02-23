package Homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskOne {

     //Решение с Array
//    public static void main(String[] args) {
//
//        double[] nums = new double[6];
//
//        double smalest = 9999999;
//        for (int i=1; i<=5; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Въведете " + i + " елемент:");
//            nums[i] = (scanner.nextInt());
//
//            if (( nums[i] % 3 ==0) && (nums[i] < smalest)){
//                smalest =  nums[i];
//            }
//
//        }
//        System.out.println("Най-малкото число кратно на 3 е: "+ smalest);
//}

    //Решение с ArrayList
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        double smallest = 999999999;

        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Въведете " + i + " елемент:");
            numbers.add(scanner.nextInt());
        }
        for (int i : numbers) {
            if ((i % 3 == 0) && (i < smallest)) {
                smallest = i;
            }

        }
        System.out.println("Най-малкото число кратно на 3 е: " + smallest);
    }
}