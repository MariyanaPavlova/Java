package lesson09.animal;


public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);

		Cat maca = new Cat();
		IAnimal sharo = new Dog();
		Animal papagal = new Bird();

//		sharo.bringStick(); //this will result in compilation error



		zoo.addAnimal(maca);
		zoo.addAnimal(sharo);
		zoo.addAnimal(papagal);

		IAnimal[] allAnimals = zoo.getAnimals();

		for (int i = 0; i < allAnimals.length; i++) {
			if (allAnimals[i] != null) {
				allAnimals[i].walk();
				allAnimals[i].makeSomeNoise();

				if (allAnimals[i] instanceof Bird) {
//					Bird theBirdReference = (Bird) allAnimals[i];
//					theBirdReference.sing();
					((Bird) allAnimals[i]).sing();
				}

			}
		}

	}
}
