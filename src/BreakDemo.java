


public class BreakDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 200000000; i++) {
			if(i == 10000) {
				break;
			}
			System.out.println(i);

		}

	}
}
