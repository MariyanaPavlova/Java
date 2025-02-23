package lesson09.animal;

public class Cat extends Animal{
	@Override
	public void walk() {
		System.out.println("Walking like a cat...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("myau");
	}

	public void climb() {
		System.out.println("Climbing...");
	}



	@Override
	public void play() {
		System.out.println("draskam");
	}



}
