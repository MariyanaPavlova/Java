package lesson04;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int a = 5;
        int b = 5;

        int blabla = calc.sum(a, b);

        int otherResult = calc.sum(10, 10);

        String restult = calc.toString();

        System.out.println(restult);

        System.out.println(blabla);


    }
}
