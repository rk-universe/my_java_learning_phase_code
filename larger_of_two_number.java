package oopj;

import java.util.Scanner;

public class larger_of_two_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	if(x>y)
	{
		System.out.println(x + " is larger");
	}
	else
	{
		System.out.println(y + " is larger");
	}

	}

}
