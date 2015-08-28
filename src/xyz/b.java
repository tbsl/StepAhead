package xyz;

import java.util.Random;

public class b extends a {

	public static void main(String[] args) {
Random rand=new Random();


 //int   n = rand.nextInt(50) + 1;
		 
	//	 String randomNo=Integer.toString(n);
		// String Email=randomNo+"@mailinator.com";
		 //System.out.println(Email);
	
	for(int i=1;i<1000;i++)
	{
		int   n = rand.nextInt(500000000) + 1;
	 
	 String randomNo=Integer.toString(n);
	 String Email=randomNo+"@mailinator.com";
	 System.out.println(Email);
		
	}	
	
	}
}
