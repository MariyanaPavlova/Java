package generictypes.theoldway;

public class Demo {
    public static void main(String[] args) {
        Person ivan = new Person();
        Bird tweety = new Bird();
        Dog sharo = new Dog();

        House peopleHouse = new House();
        House dogHouse = new House();
        House birdHouse = new House();

        peopleHouse.setHabitant(ivan);
        dogHouse.setHabitant(sharo);
        birdHouse.setHabitant(tweety);

        Object habitant = peopleHouse.getHabitant();
        if (habitant instanceof Person) {
            ((Person) habitant).drinkBeer();
        }

        Object habitant1 = dogHouse.getHabitant();
        if(habitant1 instanceof Dog) {
            ((Dog) habitant1).bringStick();
        }

        Object habitant2 = birdHouse.getHabitant();
        ((Bird) habitant2).fly();

    }
}
