
/*file			:	Palindrome.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to check wheather a number is palindrome or not
 * date			:	03/10/23
 */package javalab;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String input;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string to be checked");
		input=sc.next();
		boolean check=ispalindrome(input);
		if(check==true)
		{
			System.out.println("the string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}

	}
	/* this function is used to recieve a string and return true or false accordingly*/
	static boolean ispalindrome(String input)
	{
		char characterArray[] = input.toCharArray();
		int length=input.length();
		for(int i=0;i<length;i++)
		{
			if(characterArray[i]!=characterArray[length-i-1]) {
				return false;
			}
			
		}
		return true;
	}

}
