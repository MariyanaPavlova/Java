package homework6;

import java.util.Objects;

public class Person {
    String name;
    private int age;
    boolean isMan;



    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    protected double age() {
        return age;
    }

    void showPersonInfo() {
        System.out.println("Person info: name: "+ this.name + "; age: " + this.age() + "; gender: " + (isMan ? "Male" : "Female"));
    }


}
