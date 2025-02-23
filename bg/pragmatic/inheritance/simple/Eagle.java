package bg.pragmatic.inheritance.simple;

public class Eagle extends Bird {

	//overload
	void fly(int meters) {
		System.out.println("FLying highly like a eagle " + meters + " meters" );
	}

	//override
	void fly() {
		super.fly();
		System.out.println("FLying highly like a eagle");
	}

}
