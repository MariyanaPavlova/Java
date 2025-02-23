package constructors;

public class C extends B{
    double weight;

    C() {
        System.out.println("Constructor C");
    }

    C(double weight, boolean isDangerous, int age, String name) {
        super(isDangerous, age, name);
        this.weight = weight;
    }



}
