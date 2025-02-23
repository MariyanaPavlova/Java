package lesson08.inclass2Abstract;

public abstract class Animal {
    private int age;
    private String name;

    void breathe() {
        System.out.println("breathing...");
    }

    void walk() {
        System.out.println("walking...");
    }

    abstract void makeSomeNoise();

}
