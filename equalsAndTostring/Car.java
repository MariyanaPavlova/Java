package equalsAndTostring;

import java.util.Objects;

public class Car {
    int manufactureYear;
    String model;

    Car(int manufactureYear, String model) {
        this.manufactureYear = manufactureYear;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufactureYear == car.manufactureYear && Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureYear, model);
    }
}
