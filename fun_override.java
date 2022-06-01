package oopj;

import java.util.Scanner;

class person3{
	String name;
	int age;
	person3(){
		
		name="rahul Kumawat";
		age=19;
	}
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and age");
		name=sc.nextLine();
		age=sc.nextInt();
	}
	void showData() {
		System.out.println("name is "+ name);
		System.out.println("age is "+ age);
	}
}
class student4 extends person3{
	int roll_no;
	String div;
	student4(){
		
		roll_no=23;
		div="D";
	}
	void getData(){
//		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll and div");
		roll_no=sc.nextInt();
		div=sc.nextLine();
	}void showData() {
//		super.showData();
		System.out.println("roll no is "+ roll_no);
		System.out.println("div is "+ div);
	}
}

public class fun_override {

	public static void main(String[] args) {
		person3 p3=new person3();
		student4 s4=new student4();
//		s4.getData();
//		s4.showData();
		p3.getData();
		s4.showData();
		s4.showData();

	}

}
