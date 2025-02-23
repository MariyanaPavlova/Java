package bg.pragmatic.acccessmodifiers.staticexample;

public class Person {
    private String name;
    private int age;
    public final static String NATIONALITY = "Bulgarian";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void drinkBeer(){
        System.out.println("drinking beer as years old: " + age);
    }

}
