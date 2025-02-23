package bg.pragmatic.inheritance.simple;

public class Dog extends Animal{
	boolean isDangerous;
	
	void bringStick() {
		System.out.println(this.name + " is bringing the stick");
	}
}
