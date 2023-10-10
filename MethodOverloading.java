
/*file			:	MethodOverloading.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to find the area of triangle,circle,rectangle using method overloading
 * date			:	10/10/23
 */package javalab;
 import java .util.Scanner;
public class MethodOverloading {
	public static void main(String[]args) {
		float base,height,radius;
		int length,breadth;
		Scanner sc =new Scanner (System.in);
		Shapes shapes=new Shapes();
		System.out.println("enter the base of triangle");
		base=sc.nextFloat();
		System.out.println("enter the height of triangle");
		height=sc.nextFloat();
		System.out.println("enter the width of rectangle");
		length=sc.nextInt();
		System.out.println("enter the height of rectangle");
		breadth=sc.nextInt();
		System.out.println("enter the radius of circle");
		radius=sc.nextFloat();
		shapes.Area(base,height);
		shapes.Area(length,breadth);
		shapes.Area(radius);
	}

}
 class Shapes
{
	double area;
	public void Area(float base,float height)
	{
		
		area=base*height*0.5;
		System.out.println("area of triangle="+area);
	}
	public void Area(int length,int breadth)
	{
		area=length*breadth;
		System.out.println("area of rectangle="+area);
	}
	public void Area(float radius)
	{
		area=3.14*radius*radius;
		System.out.println("area of circle="+area );
	}
	
}
