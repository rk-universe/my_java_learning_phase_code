package oopj;

import java.util.Scanner;

public class Throw_user_define_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		try {
			float x=sc.nextFloat();
			float y=sc.nextFloat();
			float d= x/y;
			System.out.println("division of "+x+" and "+y+" is "+d);
			if(y==0) {
				throw new ArithmeticException("you cannot divide by zero");
		}
		}

		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("value should be int or float");
		}
		
		


	}

}
