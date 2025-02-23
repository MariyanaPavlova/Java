package equalsAndTostring;

import java.util.Objects;

public class Person {
    int age;
    String name;
    Car myCar;
    double weight;


    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Person(int age, String name, Car myCar) {
        this(age, name);
        this.myCar = myCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(myCar, person.myCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, myCar);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", myCar=" + myCar +
                ", weight=" + weight +
                '}';
    }

}
