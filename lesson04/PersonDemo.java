package lesson04;

public class PersonDemo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW 320", true, "Black", 200000, 360);

		Person ivan = new Person("Ivan", 54535, true);
		Person maria = new Person(22, "Maria");
		Person mariika = new Person(22, "Marii4eto");

		maria.eat();
		bmw.changeColor("Red");

		Car mercedes = new Car("Mercedes S500", true, "White", 200000, 300);
		bmw.price = 100000;

		boolean comparison = bmw.isMoreExpensive(mercedes);
		System.out.println("Is " + bmw.model +" is more axpensive than " + mercedes.model + ": " + comparison);

		bmw.calculateCarPriceForScrap(20);
		ivan.buyCar(bmw);
		bmw.changeOwner(mariika);

		ivan.cellCarForScrap();
	}
}
