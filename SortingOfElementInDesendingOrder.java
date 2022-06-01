package oopj;

import java.util.Scanner;

public class SortingOfElementInDesendingOrder {

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
	      int temp;
	      for(int i=0;i<n;i++)
	      {
	    	  for(int j=0;j<n;j++)
	    	  {
	    		  if(a[i]>a[j]) 
	    		  {
	    			  temp=a[i];
	    			  a[i]=a[j];
	    			  a[j]=temp;
	    		  }
	    	  }
	      } for(int i=0;i<n;i++)
	      {
	    	
	    	  System.out.println(a[i]);
	      }

	}

}
