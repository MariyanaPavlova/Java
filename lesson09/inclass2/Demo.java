package lesson09.inclass2;

public class Demo {
    public static void main(String[] args) {
        PregnancyReactor hubby = new Husband();
        PregnancyReactor ivan = new Lover();
        PregnancyReactor test = new PregnancyTest();

        hubby.react(true);
        hubby.react(false);
        ivan.react(true);
        ivan.react(false);
        test.react(true);
        test.react(false);
    }
}
