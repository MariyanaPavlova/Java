import java.util.Scanner;

public class HomeworkTaskThree {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = a;
        a = b;
        b = c;

        System.out.println("changed a = "+ a);
        System.out.println("chanbed b = "+ b);
    }
}
