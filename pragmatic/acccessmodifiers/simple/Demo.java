package bg.pragmatic.acccessmodifiers.simple;




public class Demo {

    public static void main(String[] args) {
        Cat maca = new Cat("Garfield", 2);
        Dog sharo = new Dog("Sharo", 3, true);

        maca.climb();

// -не се достъпват защото breathe e private-видим само в класа
//        sharo.breathe();
//        maca.breathe();
//        tiger.breathe();

        maca.play();

        sharo.play();
        sharo.bringStick();


    }
}
