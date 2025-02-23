package bg.pragmatic.acccessmodifiers.inclass1;

public class Animal {
    private int age;
    private double weight;

    protected Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    protected double getWeight() {
        return weight;
    }

    void breathe() {
        System.out.println("animal is breathing...");
    }

    protected void walk() {
        System.out.println("animal is walking...");
    }
}
