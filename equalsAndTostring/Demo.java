package equalsAndTostring;

public class Demo {
    public static void main(String[] args) {
        Car bmw = new Car(1999, "5-ca");
        Car bmw2 = new Car(1999, "5-ca");
        Person ivan = new Person(22, "Ivan Ivanov");
        Person ivan2 = new Person(22, "Ivan Ivanov");
        Person ivan3 = new Person(23, "Ivan Georgiev");

        System.out.println(ivan);
        System.out.println(ivan.toString());


        Person borislav = new Person(30, "Borislav", bmw);
        Person borislav2 = new Person(30, "Borislav", bmw2);

        System.out.println(borislav.toString());

        if(borislav.equals(borislav2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if(ivan == ivan2) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

        if(ivan.equals(ivan2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

        if(ivan.equals(ivan3)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }




    }
}
