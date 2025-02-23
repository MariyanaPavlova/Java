package collections;

import java.util.Objects;

public class Person {
    private String phone;
    private String name;


    public Person(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(phone, person.phone) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

