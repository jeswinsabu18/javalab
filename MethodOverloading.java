
/*file			:	MethodOverloading.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to find the area of triangle,circle,rectangle using method overloading
 * date			:	10/10/23
 */package javalab;
public class MethodOverloading {
	public static void main(String[]args) {
		Shapes shapes=new Shapes();
		shapes.Area(12.5f, 13.5f);
		shapes.Area(15, 30);
		shapes.Area(17.5f);
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
