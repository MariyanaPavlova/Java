package bg.pragmatic.inheritance.simple;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat garfield = new Cat();

		garfield.walk();
		garfield.climb();
		garfield.name = "Garfield Debelia";

		garfield.climb();

		Cat maca = new Cat();
		maca.name = "Macundra";

		maca.walk();
		garfield.walk();

		Dog sharo = new Dog();
		sharo.name = "Sharo";

		sharo.bringStick();
		sharo.walk();

		Bird golqmoPile = new Bird();
		golqmoPile.name = "Pilcho";
		golqmoPile.walk();
		sharo.walk();
		maca.walk();

		Sparrow vrabcho = new Sparrow();

		vrabcho.fly();
		golqmoPile.fly();

		golqmoPile.walk();


		Eagle orlio = new Eagle();
		orlio.fly(3);
		orlio.fly();


	}
}
