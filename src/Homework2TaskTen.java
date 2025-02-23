import java.util.Scanner;

public class Homework2TaskTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bъведете n:");
        int n = sc.nextInt();
        int prime = 0; //прости числа са: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,

        for (int i = 2; i <= n; i++){
            if (n%i == 0 && n%2 !=0){
                prime = i;
            }
        }
        if ((prime !=0 ) || (n == 2)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }

    }
}
