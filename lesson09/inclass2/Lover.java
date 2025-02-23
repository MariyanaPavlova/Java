package lesson09.inclass2;

public class Lover implements PregnancyReactor {
    @Override
    public void react(boolean isPregnant) {
        if(isPregnant) {
            System.out.println("Are you sure! Fuuuuck!");
        } else {
            System.out.println("Phewww, thank God!");
        }
    }

    void playFootball() {
        System.out.println("lover playing football");
    }
}
