package bg.pragmatic.acccessmodifiers.finalexample;

public class FinalDemo {
    public static void main(String[] args) {
        final Cat maca = new Cat(1);
        Dog sharo = new Dog(2);
        maca.setAge(3);

//        maca = new Cat(23);   cannot point to other object, it's final

        final int MY_AGE = 25;

    }
}
