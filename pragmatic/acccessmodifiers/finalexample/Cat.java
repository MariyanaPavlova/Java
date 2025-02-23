package bg.pragmatic.acccessmodifiers.finalexample;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
    }

    //cannot override because it's final
//    @Override
//    public void walk() {
//        System.out.println("cat is walking...");
//    }
}
