import java.util.Scanner;

public class Homework2TaskEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(("Въведете n: "));

        }
        System.out.println();
        for (int ii = 1; ii <= n; ii++){
            System.out.print(ii + "            ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            for (int jj = 0; jj <= j; jj++) {
                System.out.print(j);
            }
            System.out.print("            ");
        }
        System.out.println();

    }
}
