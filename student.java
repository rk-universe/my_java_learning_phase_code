package oopj;

import java.util.Scanner;

public class student {
	Scanner sc = new Scanner(System.in);
	String name;
	int roll;
	String branch;
	student(){
		name= ("Rahul");
		roll=23;
		branch= "AIML";
	}
	void getData() {
	System.out.println("Enter name roll and branh");
		name=sc.nextLine();
		roll=sc.nextInt();
		branch = sc.next();
	}
	void showData() {
		System.out.println("Name is " + name);
		System.out.println("roll is " + roll);
		System.out.println("branch is " + branch);
	}
	public static void main(String[] args) {
		student s = new student();
		s.getData();
		s.showData();
//	
	}

}
