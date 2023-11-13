
/*file			:	Testanimals.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to use multiple interface using interfaces
 * date			:	04/11/23
 */
package test;



public class Testanimals {
public static void main(String[]args) {
		
		Fish fish=new Fish();
		System.out.println("FISH");
		fish.setname("mimi");
		System.out.println("this fish's name is "+fish.getname());
		fish.eat();
		fish.walk();
		fish.setname("momo");
		System.out.println("this fish's name is "+fish.getname());
		System.out.println("Cat");
		Cat cat=new Cat("fluffy");
		System.out.println("the cat's name is "+cat.getname());
		cat.walk();
		cat.eat();
		cat.setname("moose");
		System.out.println("this fish's name is "+cat.getname());
		System.out.println("spider");
		Spider spider=new Spider();
		spider.eat();
		spider.walk();
	}

}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("this animal walks on "+legs+" legs");
	}
}
class Spider extends Animal{
	public Spider(){
		super(8);//all spiders have eight legs
	}
	public void eat() {
		System.out.println("the spider eats insects ");
	}
}
interface Pet{
	public String getname();
	public void setname(String name);
	public void play() ;
		
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
	super(4);
	this.name=name;
	
}
	public Cat() {
		this("");
	}

	public void eat() {
		System.out.println("the cat eat fishes");
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	public void play() {
		System.out.println("the cat is playing");
	}
}
class Fish extends Animal implements Pet{
	String name;
	public Fish() {
		super(0);
	}
	public void eat() {
		System.out.println("the fish eat plants");
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	public void play() {
		System.out.println("the fish is playing");
	}
	public void walk() {
		System.out.println("the fish has no legs");
	}
}

