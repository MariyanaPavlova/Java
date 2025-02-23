package lesson08.animal;


public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);

		IAnimal maca = new Cat();
		Cat garfield  = new Cat();

		Animal sharo = new Dog();

		IAnimal golqmoPile = new Bird();

		zoo.addAnimal(maca);
		zoo.addAnimal(garfield);
		zoo.addAnimal(sharo);
		zoo.addAnimal(golqmoPile);


		


	}
}
