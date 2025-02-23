package constructors;

public class ChainTest {

	public static void main(String[] args) {
		C myC = new C(12.4, true, 34, "Tweety");
		System.out.println(myC.weight);
		System.out.println(myC.age);
		System.out.println(myC.name);
		System.out.println(myC.isDangerous);

		C myC2 = new C();

	}
}
