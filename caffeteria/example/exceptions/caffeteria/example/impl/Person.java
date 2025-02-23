package caffeteria.example.exceptions.caffeteria.example.impl;

public class Person {
    private final static int MIN_COFFEE_TEMPERATURE = 60;
    private final static int MAX_COFFEE_TEMPERATURE = 80;

    void drink(CoffeeCup cup) throws TooColdCoffeeException, TooHotCoffeeException {
        if(cup.getTemperature() < MIN_COFFEE_TEMPERATURE) {
            throw new TooColdCoffeeException("Too cold coffee: " + cup.getTemperature());
        }
        if(cup.getTemperature() > MAX_COFFEE_TEMPERATURE) {
            throw new TooHotCoffeeException("Too hot coffee: " +  + cup.getTemperature());
        }

        System.out.println("So GOOOOOD coffee!");
    }
}
