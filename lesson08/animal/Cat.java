package lesson08.animal;

public class Cat extends Animal{

	public void climb() {
		System.out.println("Climbing...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("myau");
	}

	@Override
	public void play() {
		System.out.println("draskam");
	}

	@Override
	public void walk() {
		System.out.println("Walking like a cat...");
	}

}
