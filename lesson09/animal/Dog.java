package lesson09.animal;

public class Dog extends Animal{
	private boolean isDangerous;

	@Override
	public void makeSomeNoise() {
		System.out.println("Bau Bau");
	}

	@Override
	public void walk() {
		System.out.println("Walking like a dog");
	}

	public void bringStick(){
		System.out.println("dog is bringing a stick");
	}

	@Override
	public void play() {
		System.out.println("Playing with stick");
		bringStick();
	}



}
