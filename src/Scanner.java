public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("How much money do you have? ");
        double money = sc.nextDouble();

        System.out.println("Happy li si be?");
        boolean isHappy = sc.nextBoolean();

        if (money >= 5 && isHappy) {
            System.out.println("otiam na kino");
        } else {
            System.out.println("depresiq");
        }
    }

}
