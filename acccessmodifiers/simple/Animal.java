package bg.pragmatic.acccessmodifiers.simple;

public class Animal {
    String name;
    int age;


    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //видим е само в класа
    private void breathe() {
        System.out.println("breathing...");
    }

    public void play() {
        breathe();
        System.out.println("play...");
    }
}
