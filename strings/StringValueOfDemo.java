package strings;

public class StringValueOfDemo {
    public static void main(String[] args) {
        String socksPrice = "33";
        int a = 5;

        System.out.println(a + socksPrice);

        Integer intValueOfSocks = Integer.valueOf(socksPrice);
        System.out.println(a + intValueOfSocks);

        int intPrimtiveOfSocksPrice = Integer.parseInt(socksPrice);
        System.out.println(a + intPrimtiveOfSocksPrice);
    }
}
