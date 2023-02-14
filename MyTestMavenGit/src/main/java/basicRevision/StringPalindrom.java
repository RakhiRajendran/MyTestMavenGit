
package basicRevision;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgString = "MALAYALAM";
		String checkString = "";

		for (int i = orgString.length() - 1; i >=0; i--) {
			checkString = checkString + orgString.charAt(i);
			
		}
		
		//if (orgString.toLowerCase().equals(checkString.toLowerCase())) {
		if(orgString.equals(checkString)) {
			System.out.println("Palindrom String");
		}

		else {
			System.out.println("Not Palindrom String");

		}
	}

}
