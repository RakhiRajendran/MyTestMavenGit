package basicRevision;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 6, 7, 89, 9 };
		int count=0;

		for (int i = 0; i <= a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
			System.out.println(a[i]);
		}
	}
}
