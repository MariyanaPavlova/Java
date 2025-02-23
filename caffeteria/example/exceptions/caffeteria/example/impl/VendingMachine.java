package caffeteria.example.exceptions.caffeteria.example.impl;

public class VendingMachine {

    void serve(CoffeeCup cup, Person person) {
        try {
            person.drink(cup);
        } catch (TooColdCoffeeException e) {
            e.printStackTrace();
            System.out.println("This is an awfully cold coffee, take back your money!");
            return;
        } catch (TooHotCoffeeException e) {
            e.printStackTrace();
            System.out.println("This is LAVA too HOT coffee, take back your money!");
            return;
        }

        System.out.println("Opening the Vending Machine! Drink the best coffee EVER!");
    }
}
