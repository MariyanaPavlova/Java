package lesson08.animal;

public class Bird extends Animal{
	double flyingSpeed;

	void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void play() {
		System.out.println("Playing like a bird");
	}
	@Override
	public void walk() {
		System.out.println("Walking like a bird");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("piu piu");
	}


	//method overloads
	public void sing() {
		System.out.println("Singing...");
	}

	public void sing(String somethingToSing) {
		System.out.println("Singing the song" + somethingToSing);
	}

	public void sing(int singingWithIntNumber) {
		System.out.println("I'm singing with this Int number:" + singingWithIntNumber);
	}


}
