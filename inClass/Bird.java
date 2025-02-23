package inClass;

public class Bird extends Animal {
    int flyingSpeed;

    void fly() {
        System.out.println("bird is flying..");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("bird is walking...");
    }
}
