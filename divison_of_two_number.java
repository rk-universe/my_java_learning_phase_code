package oopj;

import java.util.Scanner;

public class divison_of_two_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		try {
			float x=sc.nextFloat();
			float y=sc.nextFloat();
			float d= x/y;
			System.out.println("division of "+x+" and "+y+" is "+d);
		}
		catch(ArithmeticException e) {
			
			System.out.println("you cannot divide by zero");
		}
		catch(Exception e) {
			System.out.println("data type should be int or float");
		}
		finally {
			System.out.println("in finally block");
		}
		
		
}
}
