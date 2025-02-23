package lesson08.inclass2Abstract;

public class Dog extends Animal {
    void bringStick() {
        System.out.println("dog is bringing stick...");
    }

    @Override
    void makeSomeNoise() {
        System.out.println("bau");
    }
}
