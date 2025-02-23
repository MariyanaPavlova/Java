package lesson09.inclass3;

public class Disco {
    private PartyAnimal[] allPartyAnimals;

    public Disco(int capacity) {
        this.allPartyAnimals = new PartyAnimal[capacity];
    }

    public void playMusic() {
        for (int i = 0; i < this.allPartyAnimals.length; i++) {
            if(this.allPartyAnimals[i] != null) {
                this.allPartyAnimals[i].letsGetParty();
            }
        }
    }

    public void makeIndividualPartyAnimalHaveFun(PartyAnimal theIndividual) {
        System.out.println("Let's get into Individual Mode!");
        theIndividual.letsGetParty();
    }

    public void allowEntrance(PartyAnimal candidate) {
        for (int i = 0; i < allPartyAnimals.length; i++) {
            if(this.allPartyAnimals[i] == null) {
                this.allPartyAnimals[i] = candidate;
                return;
            }
        }
        System.out.println("No more free space in the disco");
    }



}
