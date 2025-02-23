import java.util.Scanner;

public class HomeworkTaskSeven {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        double amount = sc.nextDouble();
        boolean health = sc.nextBoolean();


       if (health) {
           System.out.println("Здрав съм.");
           if (amount <= 5){
               System.out.println("Нямам пари, но ще отида на разходка.");
           }
           else if (amount <= 10) {
               System.out.println("Aко имам по-малко от 10 лв ще отида на кафе.");
           }
           else if (amount > 100) {
               System.out.println("Aко имам повече от 100 лв мисля да отида на почивка.");
           }
           if (hour <= 2){
               System.out.println("Aко имам повече от 2 часа ще почивам'.");
           }

       }
       else {
           System.out.println("Болен съм и няма да излизам.");
           if (amount >= 10) {
               System.out.println("Aко имам пари ще си купя лекарства.");
           } else {
               System.out.println("Ще стоя вкъщи и ще пия чай.");
           }
       }


    }
}
