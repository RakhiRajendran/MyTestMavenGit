package basicRevision;

public class PrimeNumber {
	public static void main(String args[]) {

		int n = 9, m = 0, i, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("not prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("not Prime");
					flag = 1;
					break;
				}
				if (flag == 0) {
					System.out.println("Prime");
				}

			}
		}
	}
}
