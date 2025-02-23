package bg.pragmatic.acccessmodifiers.staticexample;

public class Demo {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 33);
        Person maria = new Person("Maria", 22);

        Person georgi = new Person("Georgi", 39);


        ivan.drinkBeer();
        maria.drinkBeer();
        georgi.drinkBeer();

        System.out.println(Person.NATIONALITY);




    }
}
