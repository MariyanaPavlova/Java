package lesson09.animal;

public class Bird extends Animal{
	double flyingSpeed;

	@Override
	public void makeSomeNoise() {
		System.out.println("Piu piu");
	}

	@Override
	public void play() {
	}


	public void fly() {
		System.out.println("Flying...");
	}

	//method overloads
	public void sing() {
		System.out.println("Singing...");
	}

	public void sing(String somethingToSing) {
		System.out.println("Singing the song " + somethingToSing);
	}

	public void sing(int singingWithIntNumber) {
		System.out.println("I'm singing with this Int number:" + singingWithIntNumber);
	}


}
