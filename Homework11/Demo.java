package Homework11;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Пешо", 20, 170, 70);
        try {

            Person person2 = new Person("Пенка", -20, 160, 50);
            person.setAge(-5);
            person2.setAge(0);

        } catch (NegativeValueException e) {
            System.err.println("Грешка: " + e.getMessage());
       }


        try {
            person.setHeight(0);
        } catch (NegativeValueException e){
            //System.out.println("Грешка " + e.getMessage());
            System.err.println("Грешка " + e.getMessage());
        }

        person.setWeight(0);
    }
}
