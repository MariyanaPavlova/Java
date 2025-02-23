import java.util.Scanner;

public class Homework2TaskFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете първото число:" );
        int a = sc.nextInt();
        System.out.println("Въведете второто число:");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++){
            System.out.print(i+ " ");
        }
    }
}
