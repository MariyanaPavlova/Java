package bg.pragmatic.acccessmodifiers.simple;

public class Dog extends Animal {

    boolean isDangerous;

    Dog(String name, int age, boolean isDangerous) {
        super(name, age);
        this.isDangerous = isDangerous;
    }

    void bringStick() {
        System.out.println("dog is bringing a stick");
    }

}
