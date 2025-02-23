import java.util.Scanner;

public class Homework2TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете число:");
        int a = sc.nextInt();

        int summ = 0;

        for (int i = 1; i <= a; i++){
            summ += i;
        }

        System.out.print("Резултата е: " + summ);
    }
}
