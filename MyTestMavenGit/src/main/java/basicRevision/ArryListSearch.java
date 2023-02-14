package basicRevision;

import java.util.ArrayList;

public class ArryListSearch {
public static void main(String[] args) {
		
		ArrayList <Integer> srch = new ArrayList <Integer>();
		srch.add(34);
		srch.add(4);
		srch.add(3);
		srch.add(340);
		System.out.println(srch);
		if(srch.contains(78))
		System.out.println("78 is present in Arryalist");
		else
		{
			System.out.println("78 is not present in Arryalist");
		}
		
	
	}

}
