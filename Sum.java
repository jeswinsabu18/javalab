/*Author:Jeswin sabu
 * version:1.0
 * data:sum of two integer data
 */
package javalab;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int number1,number2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("emter two integer number");
		number1=sc.nextInt();
		number2=sc.nextInt();
		sum=number1+number2;
		System.out.println("sum of two numbers="+sum);
	}

}
