package oopj;

import java.lang.*; 
import java.util.*; 
import java.io.*;

abstract class shape {
	abstract void area();
}

class rectangle2 extends shape 
{ void area() 
{
Scanner a = new Scanner(System.in); System.out.println("Enter a the length :"); int l = a.nextInt();
Scanner c = new Scanner(System.in); System.out.println("Enter a breadth :"); int b = c.nextInt();
int area = l * b;
System.out.println("Area of rectangle :" + area);
}
}
 

class circle extends shape
{ void area() 
{
Scanner d = new Scanner(System.in); System.out.println("Enter a the radius :"); int r = d.nextInt();
int area = (22 / 7) * (r * r); System.out.println("Area of circle is :" + area);
}
}

public class abstractshape {
public static void main(String args[]) { System.out.println("RECTANCLE"); rectangle2 r1 = new rectangle2(); r1.area(); System.out.println("CIRCLE"); circle c1 = new circle();
c1.area();
}
}

