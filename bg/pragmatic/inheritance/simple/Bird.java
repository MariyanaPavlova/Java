package bg.pragmatic.inheritance.simple;


public class Bird extends Animal {
	double flyingSpeed;
	
	void fly() {
		System.out.println("Flying...");
	}

	void walk() {
		System.out.println(this.name + " is walking with two legs");
		super.walk();
	}



}
