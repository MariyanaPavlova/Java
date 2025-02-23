package generictypes.thenewway;

public class House<T extends LivingCreature> {
    private T habitant;

    public T getHabitant() {
        return habitant;
    }

    public void setHabitant(T habitant) {
        this.habitant = habitant;
    }
}
