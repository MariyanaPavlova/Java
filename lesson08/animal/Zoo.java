package lesson08.animal;


public class Zoo implements IZoo {
	private IAnimal[] animals;
	
	public Zoo(int cages) {
		animals = new IAnimal[cages];
	}
	
	public void addAnimal(IAnimal animalToAdd) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animalToAdd;
				return;
			}
		}
	}

	public IAnimal[] getAnimals() {
		return this.animals;
	}
}
