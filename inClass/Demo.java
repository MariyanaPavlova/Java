package inClass;

public class Demo {
    public static void main(String[] args) {
        Cat maca = new Cat();
        Dog sharo = new Dog();
        Bird tweety = new Bird();

        maca.climb();
        maca.breathe();
        maca.walk();

        sharo.bringStick();
        sharo.breathe();
        sharo.walk();

        tweety.fly();
        tweety.breathe();
        tweety.walk();

        Eagle orlio = new Eagle();
        Sparrow jack = new Sparrow();
        orlio.fly();
        jack.fly();

        orlio.walk();



    }

}
