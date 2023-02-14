package basicRevision;

public class SuperClassB extends SuperClassA{
	public void divisible() {
		
			super.addition(15,36);
			if((result%10) == 0)
			{
				System.out.println("Number divisible by 10");
			}
			else
			{
				System.out.println("Number not divisible by 10");
			}
			
		}
		
	
	
	public static void main(String args[]) {
		SuperClassB obj = new SuperClassB();
		obj.divisible();
	}
}
