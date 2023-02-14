package basicRevision;

import java.util.*;  
public class ScannerEg {    
    public static void main(String[] args) {      
        System.out.print("Enter House name: ");         
        Scanner scan = new Scanner(System.in);    
        String houseName = scan.next(); 
        System.out.print("Enter Street name: ");   
        String streetName = scan.next();  
        System.out.println("House Name is: "+houseName);  
        System.out.println("Street Name is: "+streetName);    
        scan.close();  
  
    }  
}  