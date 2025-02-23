package lesson09.inclass2;

public class PregnancyTest implements PregnancyReactor{
    @Override
    public void react(boolean isPregnant) {
        if(isPregnant) {
            System.out.println("2 lines");
        } else {
            System.out.println("1 lines");
        }
    }

    void autoClean() {
        System.out.println("cleaning result for reusability");
    }

}
