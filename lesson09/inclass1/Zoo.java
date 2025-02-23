package lesson09.inclass1;

public class Zoo {
    private Animal[] allAnimals;

    Zoo(int cages) {
        this.allAnimals = new Animal[cages];
    }

    void addAnimal(Animal someAnimal) {
        for (int i = 0; i < allAnimals.length; i++) {
            if(allAnimals[i] == null) {
                allAnimals[i] = someAnimal;
                return;
            }
        }
        System.out.println("No free cages for more animals!");
    }

    public Animal[] getAllAnimals() {
        return allAnimals;
    }
}
