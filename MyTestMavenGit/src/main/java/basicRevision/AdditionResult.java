package basicRevision;

public class AdditionResult extends Addition {

	public void display()
	{
		System.out.println("The sum of 2 numbers is: "+super.sum);
		
		if(super.sum%10==0)
		{
			System.out.println("The sum is divisible by 10");
		}
		else 
		{
			System.out.println("The sum is not divisible by 10");
		}
	}
	public static void main(String[] args) 
	{
		AdditionResult c=new AdditionResult();
		c.add(10, 25);
		c.display();
	
	}

}


