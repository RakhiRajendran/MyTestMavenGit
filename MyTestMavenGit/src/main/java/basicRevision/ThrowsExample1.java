package basicRevision;

public class ThrowsExample1 {
	
		   void addition() throws ArithmeticException{  
			throw new ArithmeticException("mistake in addition"); 
		   }  
		   void multiplication() throws ArithmeticException{  
			   addition();  
		   }  
		   void division(){  
			try{  
				multiplication();  
			}
			catch(ArithmeticException e){
			   System.out.println("Handled ArithmeticException");
			}  
		   }  
		   public static void main(String args[]){  
			   ThrowsExample1 obj=new ThrowsExample1();  
			obj.division();  
			System.out.println("Programers program");  
		   }  
		}


