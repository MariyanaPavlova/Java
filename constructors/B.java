package constructors;

public class B extends A {
	boolean isDangerous;

	B() {
		System.out.println("Constructor B");
	}

	B(boolean isDangerous, int age, String name) {
		super(age, name);
		this.isDangerous = isDangerous;
	}

}