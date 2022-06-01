package oopj;

import java.util.Scanner;

class person1{
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	person1(){
		System.out.println("constructor od class person");
		name="rahul";
		age=19;
	}
	person1(int x){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and age");
		name=sc.nextLine();
		age=sc.nextInt();
	}
void showdata() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	
}

class student2 extends person1{
	int roll_no;
	String div;
	student2(){
		super();
		roll_no=23;
		div="D";
		
	}
	student2(int y){
		super(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no and div");
		roll_no=sc.nextInt();
		div=sc.nextLine();
		
	}
	void showdata() {
		
		super.showdata();
		System.out.println("roll no is "+roll_no);
		System.out.println("div is "+div);
	}
	
}
class faculty extends person1{
	String qualification;
	int faculty_id;
	faculty(){
		super();
		qualification="12th";
		faculty_id=001;
	}
	faculty(int f){
		super(4);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no and div");
		qualification=sc.nextLine();
		faculty_id=sc.nextInt();
		
	
	}
	void showdata() {
		super.showdata();
		System.out.println("roll no is "+qualification);
		System.out.println("div is "+faculty_id);
	}
		
	
}

public class multilevel_inhirit {
	
	

	public static void main(String[] args) {
	
//	person1 p1=new person1();
	student2 s1=new student2(3);
//	faculty f1=new faculty();
	s1.showdata();

	}

}
