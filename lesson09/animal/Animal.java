package lesson09.animal;


public abstract class Animal implements IAnimal {
	private int age;
	private double weight;
	
	public void breathe() {
		System.out.println("Breathing...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public abstract void makeSomeNoise();
	public abstract void play();
}
