

import java.util.Scanner;

public class IfElseNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is greater than 0!");
            System.out.println("The number is " + number);
        } else {
            if (number == 0) {
                System.out.println("The number is equal to 0!");
            } else {
                System.out.println("The number is not greater than 0!");
            }
        }
    }
}
