package oopj;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int choice=1;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int fact = 1;
		for(int i = 1 ; i<=x;i++)
		{
			 fact = fact*i;
		}
		System.out.println(fact);
		System.out.println("if continue press 1 else 0");
		 choice = sc.nextInt();
		}while(choice==1);
		if(choice== 0) {
			System.out.println("Thankyou");
		}

	}

}
