package bg.pragmatic.acccessmodifiers.inclass2;

import bg.pragmatic.acccessmodifiers.inclass1.Animal;

public class Cat extends Animal {

    public Cat(int age, double weight) {
        super(age, weight);
    }

    void climb(){
        System.out.println("Cat with weight: "
                + getWeight() + " is climbinbg...");
    }



}
