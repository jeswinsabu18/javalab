
/*file			:	Abstractclass.java.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to print the number of sides of shape by abstract class
 * date			:	27/10/23
 */
package javalab;

public class Abstractclass {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberofside();
		triangle.numberofside();
		hexagon.numberofside();
		
	}

}
abstract class Shape{
	abstract public void numberofside() ;
		
	
}
class Rectangle extends Shape{
	public void numberofside() {
		System.out.println("number of sides of rectangle="+4);
	}
}
class Triangle extends Shape{
	public void numberofside() {
		System.out.println("number of sides of tiangle="+3);
	}
}
class Hexagon extends Shape{
	public void numberofside() {
		System.out.println("number of sides of hexagon="+6);
	}
}
