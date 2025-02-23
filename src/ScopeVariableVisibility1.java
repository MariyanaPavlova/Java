

public class ScopeVariableVisibility1 {

	public static void main(String[] args) {
		int outer = 1;

		{
			int inner = 2;
			System.out.println("inner = " + inner); //2
			System.out.println("outer = " + outer); //1

			outer = inner; //2

			if(inner == 2) {
				System.out.println("yee inner e = " + inner); //2
			}
		}

		int inner = 3;
		System.out.println("inner = " + inner); //3
		System.out.println("outer = " + outer);  //2
	}

}
