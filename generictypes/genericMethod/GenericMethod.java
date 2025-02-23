package generictypes.genericMethod;


import generictypes.theoldway.Bird;
import generictypes.theoldway.Dog;
import generictypes.theoldway.Person;

public class GenericMethod {

    public static void main(String[] args) {
        Person[] people = new Person[10];
        Dog[] dogs = new Dog[10];
        Bird[] birds = new Bird[10];

        Bird tweety1 = new Bird();
        Bird tweety2 = new Bird();
        Bird tweety3 = new Bird();
        Person ivan = new Person();
        Person stanislav = new Person();
        Person grozdan = new Person();
        Dog sharo1 = new Dog();
        Dog sharo2 = new Dog();
        Dog sharo3 = new Dog();

        insertIntoArray(people, ivan);
        insertIntoArray(people, stanislav);
        insertIntoArray(people, grozdan);

        insertIntoArray(dogs, sharo1);
        insertIntoArray(dogs, sharo2);
        insertIntoArray(dogs, sharo3);

        insertIntoArray(birds, tweety1);
        insertIntoArray(birds, tweety2);
        insertIntoArray(birds, tweety3);
    }

    public static <P> void insertIntoArray(P[] someArray, P whatToAddInTheArray) {
        for (int i = 0; i < someArray.length; i++) {
            if(someArray[i] == null) {
                someArray[i] = whatToAddInTheArray;
                return;
            }
        }
        System.out.println("No more free places!");
    }


//    public static void insertIntoArray(Person[] people, Person person) {
//        for (int i = 0; i < people.length; i++) {
//            if(people[i] == null) {
//                people[i] = person;
//                return;
//            }
//        }
//        System.out.println("No more free places!");
//    }
//
//    public static void insertIntoArray(Dog[] dogs, Dog dog) {
//        for (int i = 0; i < dogs.length; i++) {
//            if(dogs[i] == null) {
//                dogs[i] = dog;
//                return;
//            }
//        }
//        System.out.println("No more free places!");
//    }
//
//    public static void insertIntoArray(Bird[] birds, Bird bird) {
//        for (int i = 0; i < birds.length; i++) {
//            if(birds[i] == null) {
//                birds[i] = bird;
//                return;
//            }
//        }
//        System.out.println("No more free places!");
//    }

}
