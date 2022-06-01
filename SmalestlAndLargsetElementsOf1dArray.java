package oopj;

import java.util.Scanner;

public class SmalestlAndLargsetElementsOf1dArray {

	public static void main(String[] args) {
		
			System.out.println("enter the number of elements");
			  Scanner sc=new Scanner(System.in);
		      int n=sc.nextInt();
		      int a[]=new int[n];
		      System.out.println("Enter the elements");
		      for(int i=0;i<n;i++)
		      {
		    	  a[i]=sc.nextInt();
		      }
		      System.out.println("elements you entered is");
		      for(int i=0;i<n;i++)
		      {
		    	
		    	  System.out.println("Element "+ i +" is "+a[i]);
		      }
		     int max= a[0];
		     int min=a[0];
		     for(int i=0;i<n;i++)
		     {
		    	 if(a[i]>max) 
		    	 {
		    		 max=a[i];
		    	 }
		    	 if(a[i]<min) 
		    	 {
		    		min=a[i] ;
		    	 }
		    
		    }
		     System.out.println("Largest element is "+max);
		     System.out.println("smallest element is "+min);
	}

}
