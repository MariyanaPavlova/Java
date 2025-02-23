package bg.pragmatic.inheritance.simple;

public class Animal {
	
	String name;
	int age;
	double weight;

	void breathe() {
		System.out.println("animal is breathing");
	}

	void walk() {
		System.out.println(this.name + " is walking");
	}
}
