package oopj;

import java.util.Scanner;

public class transposeOfArray {

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
        			System.out.print(a[i][j]+" ");
        		}System.out.println();
        	}
	        
	        System.out.println("transpose of element ia ");
//	        	int tran[][]=new int[r][c];
	        for(int i=0; i<c;i++)
	         {            
	            for(int j=0; j<r;j++)
	            {
	               System.out.print(a[j][i]+" ");
	            }
	            System.out.println();
	         }

	}

}
