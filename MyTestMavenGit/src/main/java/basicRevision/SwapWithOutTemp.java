package basicRevision;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23;
		int b = 54;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
