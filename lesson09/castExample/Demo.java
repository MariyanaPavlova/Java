package lesson09.castExample;

public class Demo {
    public static void main(String[] args) {
        Eagle orlio = new Eagle();
        Bird orlio2 = new Eagle();
        Animal orlio3 = new Eagle();

//        orlio3.sing(); // compilation error, because in Animal there is no sing() method

        Bird birdRefOfOrlio3 = (Bird) orlio3;
        birdRefOfOrlio3.sing();

        ((Eagle) orlio3).sing();
        Bird birdRefOfOrlio2 = (Bird) orlio2;

    }
}
