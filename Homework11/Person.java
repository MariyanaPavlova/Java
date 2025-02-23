package Homework11;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;


    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if (age<0){
            throw new NegativeValueException("Годините трябва да са положително число");
        }
        this.age = age;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new NegativeValueException("Ръстът трябва да е положително число");
        }
        this.height = height;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new NegativeValueException("Теглото трябва да е положително число");
        }
        this.weight = weight;
    }


}


