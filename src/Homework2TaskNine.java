import java.util.Scanner;

public class Homework2TaskNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете A:");
        int a = sc.nextInt();
        System.out.println("Въведете B:");
        int b = sc.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i% 3!=0) {
                c = i * i;
                System.out.print(c + ", ");
            }else {
                System.out.print("skip " + i + ", ");;
            }
        }
    }
}
