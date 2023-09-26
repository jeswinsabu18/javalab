/*file			:	AdditionOfPositiveNumbers.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	add positive numbers,stop the  execution when enter a negative number
 * date			:	26/09/23
 */
package javalab;
import java.util.Scanner;
public class AdditionOfPositiveNumbers {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer number");
		number =sc.nextInt();
		while(number>0)
		{
			sum=sum+number;
			System.out.println("enter an next integer number");
			number =sc.nextInt();
		}
		System.out.println("the sum of positive numbers="+sum);

	}

}
