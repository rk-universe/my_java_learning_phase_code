package oopj;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		System.out.print("Enter row and column of 1st matrix : ");
	       Scanner sc=new Scanner(System.in);
	       int r1=sc.nextInt();
	       int c1=sc.nextInt();
	       
	       System.out.println("Enter array elements of 1st matrix: ");    
	        
	       int a[][]=new int[r1][c1];
	        
	          
	        for(int i=0; i<r1;i++)
	         {            
	            for(int j=0; j<c1;j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	         }
	     System.out.println("Enter second matrix row and column");
	     int r2=sc.nextInt();
	     int c2=sc.nextInt();
	     
	     int b[][]=new int[r2][c2];
	     System.out.println("Enter array elements : ");    
	        
	        
	          for(int i=0; i<r2;i++)
	         {            
	            for(int j=0; j<c2;j++)
	            {
	                b[i][j]=sc.nextInt();
	            }
	         }
	          System.out.println();
	      System.out.println("matrix 1st is" );
	      System.out.println();
	      	for(int i=0;i<r1;i++) 
	      	{
	      		for(int j=0;j<c1;j++)
	      		{
	      			System.out.print(a[i][j]+" ");
	      		}
	      		System.out.println();
	      	}
	      	System.out.println();
	     System.out.println("matrix 2nd is ");
	     System.out.println();
	 	for(int i=0;i<r2;i++) 
    	{
    		for(int j=0;j<c2;j++)
    		{
    			System.out.print(a[i][j]+" ");
    		}System.out.println();
    	}
	 	
	 	if(r1==r2 && c1==c2) 
	 	{
	 		System.out.println("Addition of matrix is ");
	 		int add[][]=new int[r1][c1];
	 		for(int i=0;i<r1;i++) 
	      	{
	      		for(int j=0;j<c1;j++)
	      		{
	      			add[i][j]=a[i][j] + b[i][j];
	      			System.out.print(add[i][j]+" ");
	      		}
	      		
	      		System.out.println();
	      	}
	 	}
	 	else {
	 		System.out.println("number of rows and colummn should be same to perform addition");
	 	}
	 	

	}

}
