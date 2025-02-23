package lesson03.classes;

public class Person {

	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	String address;
	Person friend;
	double drunkLiters;


	void watchMovie(String cinema, String movie) {
		System.out.println(name + " is watching movie: " + movie + " in cinema: " + cinema);
	}

	void drinkWater(double liters) {
		if(liters < 1) {
			System.out.println(name + " is drinking " + liters + " water");
			drunkLiters += liters;
			//drunkLiters = drunkLiters + liters;
		} else {
			System.out.println("That's too much water to drink");
		}
	}

	void eat() {
		System.out.println(name + " is eating whatever...");
		weight = weight + 2;
	}

	void walk() {
		System.out.println("Walking...");
	}
	
	void growUp() {
		System.out.println("Growing with one year");
		age++;
	}
	

	
}
