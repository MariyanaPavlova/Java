import java.util.Scanner;

public class HomeworkTaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете А:");
        double a = sc.nextDouble();

        System.out.println("Въведете B:");
        double b = sc.nextDouble();

        System.out.println("Въведете C:");
        double c = sc.nextDouble();

        if (c > a && c < b) {
            System.out.print("Числото " + c + " е между " + a + " и " + b);

        } else {
            System.out.print("Числото " + c + " не е между " + a + " и " + b);
        }
    }
}
