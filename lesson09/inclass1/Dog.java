package lesson09.inclass1;

public class Dog extends Animal {
    void bringStick() {
        System.out.println("dog is bringing stick...");
    }

    @Override
    void walk() {
        System.out.println("walking like dog");
    }

    @Override
    void makeSomeNoise() {
        System.out.println("bau");
    }
}
