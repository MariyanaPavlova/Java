package Homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведи число: ");
        int number = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(number);
        numbers.add(number);

        // краен резултат да има 10 елемента
        for (int i = 2; i < 10; i++) {
            int nextElement = numbers.get(i - 1) + numbers.get(i - 2);
            numbers.add(nextElement);
        }
        System.out.println("Колекцията е: " + numbers);
    }
}