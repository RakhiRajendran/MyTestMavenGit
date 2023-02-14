package basicRevision;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginalString = "12340";
		String reverseString = "";

		for (int i = orginalString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + orginalString.charAt(i);
		}
		System.out.println(orginalString);
		System.out.println(reverseString);
	
	
	}

}
