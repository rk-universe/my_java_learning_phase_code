package oopj;

import java.util.Scanner;

public class simple_intrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		System.out.println("Eneer Princile amount ");
		int p=sc.nextInt();
		System.out.println("Enter Rate ");
		int r = sc.nextInt();
		System.out.println("Enter time in year");
		int t = sc.nextInt();
		in= (p*r*t)/100;
		System.out.println("intrest is " + in);
	}

}
