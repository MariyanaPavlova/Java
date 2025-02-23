package lesson09.inclass1;

public class Cat extends Animal {
    void climb(){
        System.out.println("cat is climbing..");
    }

    @Override
    void walk() {
        System.out.println("walking like a cat");
    }

    @Override
    void makeSomeNoise() {
        System.out.println("myal ");
    }



}
