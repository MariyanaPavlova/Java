package lesson08.inclass2Abstract;

public class Demo {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo(5);
        Cat maca = new Cat();
        Animal otherCat = new Cat();

        Dog sharo = new Dog();
        Animal sharo2 = new Dog();

        myZoo.addAnimal(maca);
        myZoo.addAnimal(otherCat);
        myZoo.addAnimal(sharo);
        myZoo.addAnimal(sharo2);

        Animal[] allAnimals = myZoo.getAllAnimals();


    }
}
