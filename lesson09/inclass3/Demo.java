package lesson09.inclass3;

public class Demo {
    public static void main(String[] args) {
        Disco theOne = new Disco(100);
        PartyAnimal bg = new Bulgarian();
        PartyAnimal de = new German();
        Greek gr = new Greek();

        theOne.allowEntrance(gr);
        theOne.allowEntrance(de);
        theOne.allowEntrance(bg);

        theOne.playMusic();

        theOne.makeIndividualPartyAnimalHaveFun(gr);

        Cat maca = new Cat();

//        theOne.makeIndividualPartyAnimalHaveFun(maca); //compilation error as Cat is not a PartyAnimal

    }
}
