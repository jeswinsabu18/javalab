
/*file			:	PrimrOrNot.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to check whether a number is prime or not
 * date			:	31/10/23
 */
package javalab;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int number,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be checked ");
		number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		
			System.out.println(number+" is prime");
		
		else
			System.out.println(number+" is not prime");

	}

}
