
/*file			:	.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to check whether a number is prime or not
 * date			:	31/10/23
 */
package javalab;
import java.util.Scanner;
public class Exceptiondemo2 {

	public static void main(String[] args) {
		char ch='y';
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		while(ch=='y') {
		System.out.println("program to perform division");
		System.out.print("enter the first number=");
		num1=sc.nextInt();
		System.out.print("enter the second number=");
		num2=sc.nextInt();
		try {
		result=num1/num2;
		System.out.println("Result="+result);

	}
		catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}
		finally {
			System.out.println("End of operation");
			System.out.println("do you want to continue or not(y/n)");
			ch=sc.next().charAt(0);
		}
		}

}
}