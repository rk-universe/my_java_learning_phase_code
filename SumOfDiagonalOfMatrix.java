package oopj;

import java.util.Scanner;

public class SumOfDiagonalOfMatrix {

	public static void main(String[] args) {
		System.out.print("Enter an row and column size : ");
	       Scanner sc=new Scanner(System.in);
	       int r=sc.nextInt();
	       int c=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int a[][]=new int[r][c];
	        
	          
	        for(int i=0; i<r;i++)
	         {            
	            for(int j=0; j<c;j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	         }
	        System.out.print("\nData you entered : \n");
	        	for(int i=0;i<r;i++) 
	        	{
	        		for(int j=0;j<c;j++)
	        		{
	        			System.out.print(a[i][j]);
	        		}System.out.println();
	        	}
	        	if(r==c) {
	        	System.out.println("sum of Diagonal is ");
	        int s=0;
		 		for(int i=0;i<r;i++) 
		      	{
		      		for(int j=0;j<c;j++)
		      		{
		      			if(i==j) 
		      			{
		      				s = s + a[i][j];
		      			}
		      			
		      		}
		      		
		      		
		      	}System.out.print(s);
		 	}
		 	else {
		 		System.out.println("number of rows and colummn should be same to perform addition");
		 	}
	        	
	        	
	        	

	}

}
