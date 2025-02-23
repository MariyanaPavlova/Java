package bg.pragmatic.acccessmodifiers.simple;

public class Cat extends Animal {

    protected Cat(String name, int age) {
        super(name, age);
    }

    protected void climb() {
        System.out.println(name + " is climbing");
    }
}
