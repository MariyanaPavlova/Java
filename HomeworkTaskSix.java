import java.util.Scanner;

public class HomeworkTaskSix {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();

        double oldA1 = a1;
        a1 = a2;
        a2 = a3;
        a3 = oldA1;

        System.out.println("changed a1 = "+ a1);
        System.out.println("chanbed a2 = "+ a2);
        System.out.println("chanbed a3 = "+ a3);
    }
}
