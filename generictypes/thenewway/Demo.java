package generictypes.thenewway;

public class Demo {
    public static void main(String[] args) {
        Person ivan = new Person();
        Bird tweety = new Bird();
        Dog sharo = new Dog();

        House<Person> peopleHouse = new House<>();
        peopleHouse.setHabitant(ivan);

        House<Dog> dogHouse = new House<>();
        dogHouse.setHabitant(sharo);

        House<Bird> birdHouse = new House<>();
        birdHouse.setHabitant(tweety);

        Person habitant = peopleHouse.getHabitant();
        habitant.drinkBeer();

        Dog habitant1 = dogHouse.getHabitant();
        habitant1.bringStick();

        Bird habitant2 = birdHouse.getHabitant();
        habitant2.fly();

        Keyboard keyboard = new Keyboard();
        House house = new House();
        house.setHabitant(ivan);
        LivingCreature habitant3 = house.getHabitant();

//        House<Keyboard> keyboardHouse = new House<>(); // compilation error
//        keyboardHouse.setHabitant(keyboard);





    }
}
