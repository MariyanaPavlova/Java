import  java.util.Scanner;



public class HomeworkTaskTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = a + b;
        int sumInt = (int) sum;
        double difference = a - b;
        double multiplication = a * b;
        double division = a / b;
        double remainder = a % b;
        System.out.println("Sum of type float is: " + sum);
        System.out.println("Sum of type int is: " + sumInt);
        System.out.println("Difference of type float is: " + difference);
        System.out.println("Difference of type int is: " + (int) difference);
        System.out.println("Multiplication of type float is: " + multiplication);
        System.out.println("Multiplication of type int is: " + (int) multiplication);
        System.out.println("Division of type float is: "+ division);
        System.out.println("Division of type float is: "+ (int) division);
        System.out.println("Remainder oper of type int is: " + remainder);
        System.out.println("Remainder oper of type int is: " + (int) remainder);

    }

}
