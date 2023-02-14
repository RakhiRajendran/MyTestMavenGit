package basicRevision;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5445;
		int temp=num;
		int rem;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=( sum*10)+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
