package lesson09.inclass1;

public class Demo {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo(5);
        Cat maca = new Cat();
        Animal otherCat = new Cat();
        Animal tweety = new Bird();
        Dog sharo = new Dog();
        Animal sharo2 = new Dog();

        myZoo.addAnimal(maca);
        myZoo.addAnimal(otherCat);
        myZoo.addAnimal(sharo);
        myZoo.addAnimal(tweety);
        myZoo.addAnimal(sharo2);

        Animal[] allAnimals = myZoo.getAllAnimals();
        for (int i = 0; i < allAnimals.length; i++) {
            if (allAnimals[i] != null) {
                allAnimals[i].walk();
                allAnimals[i].makeSomeNoise();

                if (allAnimals[i] instanceof Bird) {
                    Bird birdie = (Bird) allAnimals[i];
                    birdie.sing();
                }
            }
        }

    }
}
