package basicRevision;

public class SwapTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=23;
int b=54;
int temp;
System.out.println("Before"+a +"&"+ b);
temp=a;
a=b;
b=temp;

System.out.println("a after swap :"+a + " b after swap:"+b);
System.out.println(a +"&"+ b);
	}

}
