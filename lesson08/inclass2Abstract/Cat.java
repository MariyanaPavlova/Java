package lesson08.inclass2Abstract;

public class Cat extends Animal {
    void climb(){
        System.out.println("cat is climbing..");
    }

    @Override
    void makeSomeNoise() {
        System.out.println("myal ");
    }
}
