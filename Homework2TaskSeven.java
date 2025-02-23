import java.util.Scanner;

public class Homework2TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bъведете n:");
        int a = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count != a) {
            i = i + 1;
            if (i % 3 == 0){
                count += 1;
                System.out.print(i + ",");

            }
        }
    }
}
