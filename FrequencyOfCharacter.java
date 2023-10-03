
/*file			:	FrequencyOfCharacter.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to find the frequency of given character in string
 * date			:	03/10/23
 */
package javalab;
import java.util.Scanner;
public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String input;
		char checkCharacter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		input=sc.nextLine();
		System.out.println("enter the character whose frequency to be checked");
		checkCharacter = sc.next().charAt(0);
		int count=frequency(input,checkCharacter);
		System.out.println("the frequency of entered character="+count );
		
		
		
	}
	//this function will check the frequency of entered character and return the value
	static int frequency(String input,char checkCharacter){
		int count=0;
		char characterArray[]=input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			if(checkCharacter == characterArray[i])
			{
				count++;
			}
		}
		return count;
		
	}

}
