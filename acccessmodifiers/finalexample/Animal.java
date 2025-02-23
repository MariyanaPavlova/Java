package bg.pragmatic.acccessmodifiers.finalexample;

public class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void breathe() {
        System.out.println("animal is breathing...");
    }

    final public void walk() {
        System.out.println("animal is walking....");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
