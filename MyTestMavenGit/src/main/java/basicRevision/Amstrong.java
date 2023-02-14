package basicRevision;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int temp = num;
		int rem;
		int sum = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");

		}
	}

}
