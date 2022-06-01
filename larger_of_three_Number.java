package oopj;

import java.util.Scanner;

public class larger_of_three_Number {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three number");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if(x>y && x>z)
			{
				System.out.println(x + " is larger");
			}
			else if(y>x && y>z)
			{
				System.out.println(y + "is larger");
			}
			else
			{
				System.out.println(z + " is larger");
			}

			}
	}


