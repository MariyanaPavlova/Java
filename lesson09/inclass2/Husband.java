package lesson09.inclass2;

public class Husband implements PregnancyReactor {
    @Override
    public void react(boolean isPregnant) {
        if(isPregnant) {
            System.out.println("Screaming with Joy");
        } else {
            System.out.println("We'll try again");
            drinkBeer();
        }
    }

    void drinkBeer() {
        System.out.println("husband drinking beer.");
    }
}
