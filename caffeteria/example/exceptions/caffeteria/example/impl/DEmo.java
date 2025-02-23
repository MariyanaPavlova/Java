package caffeteria.example.exceptions.caffeteria.example.impl;

import java.util.ArrayList;
import java.util.List;

public class DEmo {
    public static void main(String[] args) {
        CoffeeCup novaBrazilia = new CoffeeCup(755);
        Person nikola = new Person();
        VendingMachine machine = new VendingMachine();

        machine.serve(novaBrazilia, nikola);

        List<String> names = new ArrayList<>();

        names.add("sdflkjaldkjf");



    }
}
