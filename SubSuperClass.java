package oopj;

 class person
{
	String name;
	char gender;
	person()
	{
		System.out.println("constructor of super class");
	}
	
	person(String name,char gender)
	{
		this.name=name;
		this.gender=gender;
		
	}
 void showdata() 
 	{
		System.out.println("name is " +name);
		System.out.println("gender is " +gender);
	}
	
	
}
class student extends person
{
	int roll;
	char div;
	student()
	{
		super();
		System.out.println("constructor of sub class");
	}
	
	student(String name,char gender,int roll,char div)
	{
		super(name,gender);
		this.roll=roll;
		this.div=div;
		
		
	}
	void showdata() {
		super.showdata();
		System.out.println("roll no is "+roll);
		System.out.println("div is "+div);
	}
}

public class SubSuperClass {

	public static void main(String[] args) {
		
	
		person p1=new person();
		
		student s1=new student("Rahul",'M',23,'D');
		s1.showdata();
		

	}

}
