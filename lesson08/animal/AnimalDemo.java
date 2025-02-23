package lesson08.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal pile = new Bird();

        pile.makeSomeNoise();

        pile.play();

        pile.breathe();


        IAnimal sharo = new Dog();
        sharo.makeSomeNoise();

    }
}
